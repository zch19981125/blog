package com.caihua.controller;

import com.caihua.commonApi.entity.Project;
import com.caihua.commonApi.response.Result;
import com.caihua.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@RequestMapping("list")
	public Result list(){
		return Result.success(projectService.list());
	}
	
	@RequestMapping("get")
	public Result get(){
		return Result.success();
	}

}
