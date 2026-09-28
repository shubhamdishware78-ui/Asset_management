package com.shubham.asset_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "asset_code",
            unique = true,
            nullable = false
    )
    private String assetCode;

    @Column(
            name = "asset_name",
            nullable = false
    )
    private String assetName;

    private String brand;

    private String category;

    @Column(nullable = false)
    private String status;

    public Asset() {
    }

    public Asset(String assetCode,
                 String assetName,
                 String brand,
                 String category,
                 String status) {

        this.assetCode = assetCode;
        this.assetName = assetName;
        this.brand = brand;
        this.category = category;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", assetCode='" + assetCode + '\'' +
                ", assetName='" + assetName + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}