package com.jp.co.logic.entity;

import java.io.Serializable;
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
public class QuestionEntity implements Serializable {
	private int id;
	private String content;
	private List<AnswerEntity> answers;
	private int questionOrder;
	private String userId;
	private Date insertdate;
	private Date updatedate;
	private int delFlg;
}
