package com.jp.co.logic.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnswerEntity implements Serializable  {
	private int id;
	private String content;
	private int questionId;
	private String userId;
	private Date insertdate;
	private Date updatedate;
	private int delFlg;
}
