package com.example.demo.team8.MariaDBtest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "bumon_tbl")
@Data
public class Bumon {
	@Id //プライマリーキー
	//Javaはアンダーバーが使えないため、工夫して名前をつける
	private String bumonCd;
	private String bumonNm;
}

