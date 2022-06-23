package com.caihua.commonApi.entity.dto;

import com.caihua.commonApi.entity.Project;
import lombok.Data;

import java.util.List;

/**
 * //todo
 *
 * <pre>
 * //todo
 * </pre>
 *
 * @author zch
 * @since $
 */
@Data
public class ProjectDto extends Project {
	
	
	private List<String> artName;
	
	
	public List<String> getArtName() {
		
		return artName;
	}
	
	
	public void setArtName(List<String> artName) {
		
		this.artName = artName;
	}
}
