package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Team8_Controller4 {
	@GetMapping("/team8_3-1")
	public String index() {
		System.out.println("indexメソッド実行");
		return "team8/team8_question3-1";
	}
	
	@PostMapping(value = "/team8_3-1", params = "next")
	public String send1(@RequestParam ("question3") String question3) {
		//↓これはうまく分岐できないときに使ってね
		System.out.println(question3);
		
		if (question3.equals("answer1")) {
			return "team8/team8_kekka";
		} else if (question3.equals("answer2")) {
			return "team8/team8_kekka";
		}
		
		return "team8/team8_question3-3";
	}
	
	
	@PostMapping(value = "/team8_3-1", params = "back")
	public String send3() {
		System.out.println("send3実行");
		return "team8/team8_question2-1";
	}
}
