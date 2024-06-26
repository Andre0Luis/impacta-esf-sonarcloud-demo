package org.cornercoding.sonarclouddemo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@RequestMapping(value="/api/v1,0/capitalize")
	public ResponseEntity<String> capitalize(@RequestParam("test") String text){
		
		String capital = text.toUpperCase();
		//String country = "Brazil";
		return ResponseEntity.ok(capital);
		
	}

	@RequestMapping(value="/api/v1,0/capitalizee")
	public ResponseEntity<String> capitalizee(@RequestParam("test") String text){
		
		String capital = text.toUpperCase();
		//String country = "Brazil";
		return ResponseEntity.ok(capital);
		
	}

	@RequestMapping(value="/api/v1,0/capitalizeee")
	public ResponseEntity<String> capitalizeee(@RequestParam("test") String text){
		
		String capital = text.toUpperCase();
		//String country = "Brazil";
		return ResponseEntity.ok(capital);
		
	}

	@RequestMapping(value="/api/v1,0/capitalizeeee")
	public ResponseEntity<String> capitalizeeee(@RequestParam("test") String text){
		
		String capital = text.toUpperCase();
		//String country = "Brazil";
		return ResponseEntity.ok(capital);
		
	}

	private String testReturn(String name){
		System.out.println("Name aqui: " + name);
		return name;
	}

}
