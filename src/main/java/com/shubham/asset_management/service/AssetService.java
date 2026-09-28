package com.shubham.asset_management.service;

import com.shubham.asset_management.entity.Asset;
import com.shubham.asset_management.repository.AssetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public Asset saveAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public long getTotalAssets() {
        return assetRepository.count();
    }

    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }

    public void updateAssetStatus(
            String assetCode,
            String status) {

        System.out.println("Asset Code = " + assetCode);

        Asset asset =
                assetRepository.findByAssetCode(assetCode);

        if (asset != null) {

            asset.setStatus(status);

            assetRepository.save(asset);

            System.out.println("Status Updated");
        }
        else {

            System.out.println("Asset Not Found");
        }
    }
}