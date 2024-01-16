package com.api.parkingcontrol.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "parking_spot")
public class ParkingSpotEntity implements Serializable {
    private static final Long serialVersioUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSportNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licencePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String responsableName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public ParkingSpotEntity() {
    }

    public ParkingSpotEntity(UUID id, String parkingSportNumber, String licencePlateCar, String brandCar, String modelCar, String colorCar, LocalDateTime registrationDate, String responsableName, String apartment, String block) {
        this.id = id;
        this.parkingSportNumber = parkingSportNumber;
        this.licencePlateCar = licencePlateCar;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.registrationDate = registrationDate;
        this.responsableName = responsableName;
        this.apartment = apartment;
        this.block = block;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ParkingSpotEntity that)) return false;
//        return Objects.equals(getId(), that.getId()) && Objects.equals(getParkingSportNumber(), that.getParkingSportNumber()) && Objects.equals(getLicencePlateCar(), that.getLicencePlateCar()) && Objects.equals(getBrandCar(), that.getBrandCar()) && Objects.equals(getModelCar(), that.getModelCar()) && Objects.equals(getColorCar(), that.getColorCar()) && Objects.equals(getRegistrationDate(), that.getRegistrationDate()) && Objects.equals(getResponsableName(), that.getResponsableName()) && Objects.equals(getApartment(), that.getApartment()) && Objects.equals(getBlock(), that.getBlock());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getParkingSportNumber(), getLicencePlateCar(), getBrandCar(), getModelCar(), getColorCar(), getRegistrationDate(), getResponsableName(), getApartment(), getBlock());
//    }
}
