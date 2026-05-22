package com.example.demo.team8;

import jakarta.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Team8_EmpForm {
	@NotEmpty(message = "どちらかを選んでください！")
	private String question1;
	private String question2_1;
	private String question2_2;
	private String question3_1;
	private String question3_2;
}
