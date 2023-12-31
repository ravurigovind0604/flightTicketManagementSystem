package com.example.flightTMS.repo;

import com.example.flightTMS.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerEntity,Integer> {
    public PassengerEntity findByPassengerUsernameAndPassengerPassword(String username,String password);
}
