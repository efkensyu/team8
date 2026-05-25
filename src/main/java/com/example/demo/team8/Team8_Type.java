package com.example.demo.team8;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "team8_type_tbl")
@Data
public class Team8_Type {
	@Id
	@Column(name = "type_cd")
	private String typeCd;
	
	@Column(name = "type_nm")
	private String typeNm;
}
