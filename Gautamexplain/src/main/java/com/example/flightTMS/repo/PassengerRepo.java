package com.example.flightTMS.repo;

import com.example.flightTMS.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerEntity,Integer> {
    public PassengerEntity findByPassengerUsernameAndPassengerPassword(String username,String password);
}


//commit 1 go
//commit 2 go
//commit 3 go
//commit 4 go
//commit 5 go
//commit 6 go
//commit 7 go
//commit 8 go

