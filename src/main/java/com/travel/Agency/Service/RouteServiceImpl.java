package com.travel.Agency.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Route;
import com.travel.Agency.Entity.Vehicle;
import com.travel.Agency.Repository.RouteRepository;

@Service
public class RouteServiceImpl implements RouteService {
@Autowired
public RouteRepository routerepo;
@Override
public Route addRoute(Route route) {
	return routerepo.save(route);
}
@Override
public void  deleteRoute(Integer RouteID) {
	 routerepo.deleteById(RouteID);
}
@Override
public List<Route> viewAllRoute() {
	return routerepo.findAll();
}
@Override
public Route modifyRoute (Route route){
	return routerepo.save(route);
}

}
