package com.jp.co.logic.entity;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionGroupEntity {
	private String id;
	private String name;
	private List<QuestionEntity> questions;
	private String userId;
	private Date insertdate;
	private Date updatedate;
	private int delFlg;
}
