package com.shubham.asset_management.controller;

import com.shubham.asset_management.service.AssetService;
import com.shubham.asset_management.service.EmployeeService;
import com.shubham.asset_management.service.AssetAssignmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
@Controller
public class PageController {

    private final AssetService assetService;
    private final EmployeeService employeeService;
    private final AssetAssignmentService assignmentService;

    public PageController(
            AssetService assetService,
            EmployeeService employeeService,
            AssetAssignmentService assignmentService) {

        this.assetService = assetService;
        this.employeeService = employeeService;
        this.assignmentService = assignmentService;
    }
    @GetMapping("/")
    public String dashboard(
            HttpSession session,
            Model model) {

        if(session.getAttribute(
                "loggedIn") == null) {

            return "redirect:/login";
        }

        model.addAttribute(
                "totalAssets",
                assetService.getTotalAssets());

        model.addAttribute(
                "totalEmployees",
                employeeService.getTotalEmployees());

        model.addAttribute(
                "totalAssignments",
                assignmentService.getTotalAssignments());

        return "dashboard";
    }
}