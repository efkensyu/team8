package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Team8_Controller3 {
	@GetMapping("/team8_2-2")
	public String index() {
		System.out.println("indexメソッド実行");
		return "team8/team8_question2-2";
	}
	
	@PostMapping(value = "/team8_2-2", params = "next")
	public String send1(@RequestParam ("question2") String question2) {
		//↓これはうまく分岐できないときにぜひ使ってね
		System.out.println(question2);
		
		if (question2.equals("answer1")) {
			return "team8/team8_question3-3";
		} else if (question2.equals("answer2")) {
			return "team8/team8_question3-4";
		}
		
		return "team8/team8_question3-3";
	}
	
	
//	@PostMapping(value = "/team8_2-2", params = "back")
//	public String send3() {
//		System.out.println("send3実行");
//		return "team8/team8_question1";
//	}
}
