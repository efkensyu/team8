package com.example.demo.team8;

import jakarta.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Team8_EmpForm3_1 {
	@NotEmpty(message = "どちらかを選んでください！")
	private String question3_1;
}
