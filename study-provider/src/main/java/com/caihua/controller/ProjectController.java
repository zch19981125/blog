package com.caihua.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caihua.commonApi.entity.Project;
import com.caihua.commonApi.entity.dto.ProjectDto;
import com.caihua.commonApi.response.Result;
import com.caihua.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@RequestMapping("list")
	@ResponseBody
	public Result list(){
		
		Page page = new Page();
		page.setPages(1);
		page.setSize(10);
		List<ProjectDto> projectDtos = projectService.pageList(page);
		return Result.success(projectDtos);
	}
	
	@RequestMapping("get")
	public Result get(){
		return Result.success();
	}

}
