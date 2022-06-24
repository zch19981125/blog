package com.caihua.service;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caihua.commonApi.entity.Project;
import com.caihua.commonApi.entity.dto.ProjectDto;
import com.caihua.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService extends ServiceImpl<ProjectMapper, Project> {
	
	/**
	 * 分页查询
	 * @return
	 */
	public List<ProjectDto> listDto(){
		List<Project> projectList= super.list();
		List<ProjectDto> projectDtos = new ArrayList<>();
		for (Project project : projectList) {
			ProjectDto projectDto = new ProjectDto();
			projectDto.setArtName(null);
			projectDtos.add(projectDto);
		}
		return projectDtos;
	}
	
	
	/**
	 * project 分页查询
	 * @param page
	 * @return
	 */
	public List<ProjectDto> pageList(Page page) {
		
		QueryWrapper<ProjectDto> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("p.id",1);
		return getBaseMapper().pageList(page,queryWrapper);
	}
}
