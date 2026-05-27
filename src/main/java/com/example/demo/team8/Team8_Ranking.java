package com.example.demo.team8;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "team8_Ranking_tbl")
@Data
public class Team8_Ranking {
	@Id
	@Column(name = "result_cd")
	private String resultCd;
	
	@Column(name = "user_nm")
	private String userNm;
	
	@Column(name = "snack_cd")
	private String snackCd;
	
}
