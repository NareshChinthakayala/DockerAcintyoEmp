package com.acintyo.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@GetMapping("/get")
	public String getmsg() {
		return "hello welcome to hyd";
	}

}
