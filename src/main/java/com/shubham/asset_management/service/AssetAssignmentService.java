package com.shubham.asset_management.service;

import com.shubham.asset_management.entity.AssetAssignment;
import com.shubham.asset_management.repository.AssetAssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetAssignmentService {

    private final AssetAssignmentRepository assignmentRepository;

    public AssetAssignmentService(
            AssetAssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public AssetAssignment saveAssignment(
            AssetAssignment assignment) {
        return assignmentRepository.save(assignment);
    }

    public List<AssetAssignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    public long getTotalAssignments() {
        return assignmentRepository.count();
    }

    public AssetAssignment getAssignmentById(Long id) {
        return assignmentRepository.findById(id).orElse(null);
    }

    public boolean isAssetAlreadyAssigned(
            String assetCode) {

        return assignmentRepository
                .existsByAssetCodeAndStatus(
                        assetCode,
                        "ASSIGNED");
    }
}