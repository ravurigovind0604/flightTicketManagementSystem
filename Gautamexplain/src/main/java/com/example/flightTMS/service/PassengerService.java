package com.example.flightTMS.service;

import com.example.flightTMS.entity.PassengerEntity;
import com.example.flightTMS.repo.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service public class PassengerService {
    @Autowired
    private PassengerRepo passengerRepo;




    public ResponseEntity<PassengerEntity> savePassenger(PassengerEntity p)
{
   PassengerEntity passengerEntity= passengerRepo.save(p);
   return ResponseEntity.status(HttpStatus.OK).body(passengerEntity);
}

    public ResponseEntity<PassengerEntity> showPassengerDetails(int id) {
        Optional<PassengerEntity> passengerEntityOptional= passengerRepo.findById(id);
        PassengerEntity passengerEntity=passengerEntityOptional.get();
        return ResponseEntity.status(HttpStatus.OK).body(passengerEntity);
    }
    public ResponseEntity<PassengerEntity> findByPassengerUsernameAndPassengerPassword(String username,String password){
        PassengerEntity passengerEntity=passengerRepo.findByPassengerUsernameAndPassengerPassword(username, password);
        return ResponseEntity.status(HttpStatus.OK).body(passengerEntity);
    }
}
