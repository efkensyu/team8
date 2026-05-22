package com.example.demo.team8;

import jakarta.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Team8_EmpForm {
	@NotEmpty(message = "どちらかを選んでください！")
	private String question1;
	@NotEmpty(message = "どちらかを選んでください！")
	private String question2_1;
	private String question2_2;
	@NotEmpty(message = "どちらかを選んでください！")
	private String question3_1;
	private String question3_2;
	@NotEmpty(message = "どちらかを選んでください！")
	private String question3_3;
}
