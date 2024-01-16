package com.api.parkingcontrol.Services;

import com.api.parkingcontrol.entities.ParkingSpotEntity;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    private final ParkingSpotRepository repository;

    public ParkingSpotService(ParkingSpotRepository repository) {
        this.repository = repository;
    }


    public ParkingSpotEntity save(ParkingSpotEntity parkingSpotEntity) {
        return repository.save(parkingSpotEntity);
    }
}
