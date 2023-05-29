package com.jp.co.application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.co.infrastructure.service.FindQuestionGroupService;
import com.jp.co.logic.entity.QuestionGroupEntity;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FindQuestionGroupController {
	private final FindQuestionGroupService service;

	@GetMapping("/")
	public List<QuestionGroupEntity> execute() {
		List<QuestionGroupEntity> entitys = service.execute();
		return entitys;
	}
}
