package com.company.domain;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date Regdate;
	private Date updateupdate;
}
