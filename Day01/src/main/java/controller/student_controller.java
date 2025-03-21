package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class student_controller {
	@GetMapping("/name")
	public String getName() {
		return "My name is Nuwan";
	}
	
	@GetMapping("/getReg")
	public String getReg() {
		return "2020ICT001";
	}
	
	@GetMapping("/getAge")
	public int getAge() {
		return 24;
	}
}
