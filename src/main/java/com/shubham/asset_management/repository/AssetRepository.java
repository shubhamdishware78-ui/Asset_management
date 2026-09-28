package com.shubham.asset_management.repository;

import com.shubham.asset_management.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {

    Asset findByAssetCode(String assetCode);

}