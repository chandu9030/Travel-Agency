package com.travel.Agency.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.Agency.Entity.Route;
import com.travel.Agency.Service.RouteService;

@RequestMapping("/route")
@RestController
public class RouteController {
	@Autowired
	public RouteService routeservice;
	@PostMapping("/addRoute")
	public Route addRoute(@RequestBody Route route) {
		return routeservice.addRoute(route);
}
	@GetMapping("/getAllRoute")
	public List<Route> viewAllRoute() {
		return routeservice.viewAllRoute();
	}
	@PutMapping("/updateRoute")
	public Route modifyRoute (@RequestBody Route route){
		return routeservice.modifyRoute(route);
}
	@DeleteMapping("/deleteRoute")
	public void  deleteRoute(@PathVariable Integer RouteID) {
		 routeservice.deleteRoute(RouteID);
}
}
