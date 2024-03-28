package com.travel.Agency.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Agency.Entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route,Integer>{

}
