package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Team8_Controller1 {
	@GetMapping("/team8_1")
	public String index() {
		System.out.println("getメソッド実行");
		return "team8/team8_start";
	}
	
	
	@PostMapping(value = "/team8_1", params = "next")
	public void send1() {
//		return "team8/team8_question1";
	}
	
	/*
	@PostMapping(value = "/team8_2", params = {"answer1","next1"})
	public String send2() {
		return "team8/team8_question2-1";
	}
	
	@PostMapping(value = "/team8_2", params = {"answer2","next1"})
	public String send3() {
		return "team8/team8_question2-2";
	}
	
	@PostMapping(value = "/team8_2", params = "back1")
	public String send5() {
		return "team8/team8_starts";
	}
	*/
	//あいうえお
}
