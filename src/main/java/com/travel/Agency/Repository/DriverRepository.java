package com.travel.Agency.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Agency.Entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {

}
