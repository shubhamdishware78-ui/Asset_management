package com.shubham.asset_management.repository;

import com.shubham.asset_management.entity.AssetAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetAssignmentRepository
        extends JpaRepository<AssetAssignment, Long> {

    boolean existsByAssetCodeAndStatus(
            String assetCode,
            String status);
}