package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Team8_loop {
	@GetMapping("/team8_kekka")
	public String index() {
		System.out.println("indexメソッド実行");
		return "team8/team8_kekka";
	}
	
	@PostMapping("/team8_kekka")
	public String send1(@RequestParam String restart, Model model) {
		model.addAttribute("restart", restart);
		//↓これはうまく分岐できないときに使ってね
		System.out.println("sendメソッド実行");
		return "team8/team8_start";
	}
}
