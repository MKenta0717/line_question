package com.jp.co.infrastructure.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.co.infrastructure.service.FindQuestionGroupService;
import com.jp.co.logic.entity.QuestionGroupEntity;
import com.jp.co.logic.repository.FindQuestionGroupRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class FindQuestionGroupServiceImpl implements FindQuestionGroupService {

	private final FindQuestionGroupRepository repo;

	@Override
	public List<QuestionGroupEntity> execute() {
		// TODO 自動生成されたメソッド・スタブ
		return repo.execute();
	}

}
