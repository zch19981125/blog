package com.caihua.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.caihua.commonApi.entity.Project;
import com.caihua.commonApi.entity.dto.ProjectDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper extends BaseMapper<Project> {


	List<ProjectDto> pageList(Page page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
