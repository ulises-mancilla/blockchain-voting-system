package com.epam.asset.tracking.dto;

import javax.validation.constraints.NotNull;

public class AssetDTO {

  
  @NotNull
  private String serialNumber;
  @NotNull
  private String assetType;
  @NotNull
  private String ownerName;
  @NotNull
  private String description;
  @NotNull
  private String summary;

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


}
