package com.ip.inject_prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Inject {
	
	
	@Value("${coach.name}")
	private String coachName;

	@GetMapping("/show")
	public String ShowName() {
		return "Inject [name=" + coachName + "]";
	}
	
	
	

}
