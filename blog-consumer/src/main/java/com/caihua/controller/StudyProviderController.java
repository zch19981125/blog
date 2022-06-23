package com.caihua.controller;

import com.caihua.commonApi.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController()
@RequestMapping("studyConsumer")
public class StudyProviderController {

	private final String STUDY_PROVIDER_URL = "http://localhost:7011/project";
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("list")
	public List<Project> listProject(){
		return restTemplate.getForObject(STUDY_PROVIDER_URL+"/list", List.class);
	}
}
