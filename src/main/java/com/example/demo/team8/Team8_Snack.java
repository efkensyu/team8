package com.example.demo.team8;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "team8_snack_tbl")
@Data
public class Team8_Snack {
	@Id
	@Column(name = "snack_cd")
	private String snackCd;
	
	@Column(name = "snack_nm")
	private String snackNm;
	
	@Column(name = "type_cd")
	private String typeCd;
	
	@Column(name = "imagepath")
	private String imagepath;
}
