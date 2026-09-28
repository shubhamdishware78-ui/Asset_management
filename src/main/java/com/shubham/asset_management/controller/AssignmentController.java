package com.shubham.asset_management.controller;

import com.shubham.asset_management.entity.AssetAssignment;
import com.shubham.asset_management.service.AssetAssignmentService;
import com.shubham.asset_management.service.AssetService;
import com.shubham.asset_management.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssignmentController {

    private final AssetAssignmentService assignmentService;
    private final AssetService assetService;
    private final EmployeeService employeeService;

    public AssignmentController(
            AssetAssignmentService assignmentService,
            AssetService assetService,
            EmployeeService employeeService) {

        this.assignmentService = assignmentService;
        this.assetService = assetService;
        this.employeeService = employeeService;
    }

    @GetMapping("/assignments")
    public String assignments(Model model) {

        model.addAttribute(
                "assignments",
                assignmentService.getAllAssignments());

        model.addAttribute(
                "assets",
                assetService.getAllAssets());

        model.addAttribute(
                "employees",
                employeeService.getAllEmployees());

        return "assignments";
    }

    @PostMapping("/saveAssignment")
    public String saveAssignment(
            AssetAssignment assignment,
            Model model) {

        if (assignmentService.isAssetAlreadyAssigned(
                assignment.getAssetCode())) {

            model.addAttribute(
                    "errorMessage",
                    "Asset is already assigned!");

            model.addAttribute(
                    "assignments",
                    assignmentService.getAllAssignments());

            model.addAttribute(
                    "assets",
                    assetService.getAllAssets());

            model.addAttribute(
                    "employees",
                    employeeService.getAllEmployees());

            return "assignments";
        }

        assignment.setStatus("ASSIGNED");

        assetService.updateAssetStatus(
                assignment.getAssetCode(),
                "ASSIGNED");

        assignmentService.saveAssignment(
                assignment);

        return "redirect:/assignments";
    }

    @GetMapping("/returnAssignment/{id}")
    public String returnAssignment(
            @PathVariable Long id) {

        AssetAssignment assignment =
                assignmentService.getAssignmentById(id);

        if (assignment != null) {

            assignment.setStatus("RETURNED");

            assetService.updateAssetStatus(
                    assignment.getAssetCode(),
                    "AVAILABLE");

            assignmentService.saveAssignment(
                    assignment);
        }

        return "redirect:/assignments";
    }
}