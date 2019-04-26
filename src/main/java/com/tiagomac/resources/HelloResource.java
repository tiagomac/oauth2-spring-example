package com.tiagomac.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiagomac.models.Hello;

@RestController
@RequestMapping(value = "/")
public class HelloResource {
	
	@GetMapping(value = "/hello")
	public ResponseEntity<Hello> sayHello(){
		Hello hello = new Hello();
		hello.setMessage("Olá Mundo!");
		return ResponseEntity.ok(hello);
	}

}
