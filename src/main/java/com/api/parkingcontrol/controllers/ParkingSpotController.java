package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.Services.ParkingSpotService;
import com.api.parkingcontrol.dtos.ParkingSportDTO;
import com.api.parkingcontrol.entities.ParkingSpotEntity;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) //permite acesso de outra fonte e/ou servidor.
@RequestMapping(value = "/parkingsport")
public class ParkingSpotController {

    private final ParkingSpotService service;

    public ParkingSpotController(ParkingSpotService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Object> saveparkingSport(@RequestBody @Valid ParkingSportDTO parkingSportDTO) {
        var parkingSpotEntity = new ParkingSpotEntity();
        //ParkingSpotEntity parkingSpotEntity = new ParkingSpotEntity(); ou este método ou o de cima.
        BeanUtils.copyProperties(parkingSportDTO, parkingSportDTO);
        parkingSpotEntity.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(parkingSpotEntity));

    }

}
