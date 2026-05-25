package com.example.demo.team8;

import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Team8_EmpForm2_1 {
	@NotNull(message = "どちらかを選んでください！")
	private String question2_1;
}
