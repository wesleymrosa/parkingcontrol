package com.api.parkingcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class ParkingSportDTO implements Serializable {
    private static final Long serialVersioUID = 1L;
    @NotBlank
    
    private String parkingSportNumber;
    @NotBlank
    @Size(max = 7)
    private String licencePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsableName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;

    public ParkingSportDTO() {
    }

    public ParkingSportDTO(String parkingSportNumber, String licencePlateCar, String brandCar, String modelCar, String colorCar, String responsableName, String apartment, String block) {
        this.parkingSportNumber = parkingSportNumber;
        this.licencePlateCar = licencePlateCar;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.responsableName = responsableName;
        this.apartment = apartment;
        this.block = block;
    }

    public String getParkingSportNumber() {
        return parkingSportNumber;
    }

    public void setParkingSportNumber(String parkingSportNumber) {
        this.parkingSportNumber = parkingSportNumber;
    }

    public String getLicencePlateCar() {
        return licencePlateCar;
    }

    public void setLicencePlateCar(String licencePlateCar) {
        this.licencePlateCar = licencePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsableName() {
        return responsableName;
    }

    public void setResponsableName(String responsableName) {
        this.responsableName = responsableName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
