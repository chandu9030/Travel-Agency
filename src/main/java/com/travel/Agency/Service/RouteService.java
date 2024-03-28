package com.travel.Agency.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.Agency.Entity.Route;
import com.travel.Agency.Entity.Vehicle;
@Service
public interface RouteService {

	Route addRoute(Route route);

	void deleteRoute(Integer RouteID);

	Route modifyRoute(Route route);

	List<Route> viewAllRoute();

}
