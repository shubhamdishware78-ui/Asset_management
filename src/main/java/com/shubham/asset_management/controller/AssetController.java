package com.shubham.asset_management.controller;

import com.shubham.asset_management.entity.Asset;
import com.shubham.asset_management.service.AssetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping("/assets")
    public String assets(Model model) {

        model.addAttribute(
                "assets",
                assetService.getAllAssets());

        return "assets";
    }

    @PostMapping("/saveAsset")
    public String saveAsset(Asset asset) {

        asset.setStatus("AVAILABLE");

        assetService.saveAsset(asset);

        return "redirect:/assets";
    }

    @GetMapping("/deleteAsset/{id}")
    public String deleteAsset(@PathVariable Long id) {

        assetService.deleteAsset(id);

        return "redirect:/assets";
    }
}