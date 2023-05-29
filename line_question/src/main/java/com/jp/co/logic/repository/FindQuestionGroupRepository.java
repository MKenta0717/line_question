package com.jp.co.logic.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jp.co.logic.entity.QuestionGroupEntity;

@Mapper
@Repository
public interface FindQuestionGroupRepository {
	public List<QuestionGroupEntity> execute();
}
