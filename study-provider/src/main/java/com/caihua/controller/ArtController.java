package com.caihua.controller;

import com.caihua.commonApi.response.Result;
import com.caihua.service.ArtService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("art")
public class ArtController {

	@Autowired
	ArtService artService;
	
	@RequestMapping("list")
	public Result list(){
		return Result.success(artService.list());
	}
	
	@RequestMapping("get")
	public Result get(String id){
		return Result.success(artService.getById(id));
	}
	
	@RequestMapping("getByPid")
	public Result getByPid(String pid){
		return Result.success();
	}
	
}
