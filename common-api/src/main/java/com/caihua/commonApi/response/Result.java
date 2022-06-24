package com.caihua.commonApi.response;

import lombok.Data;

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
public class Result {
	public static final Integer SUCCESS_CODE = 200;
	
	private static final Integer ERROR_CODE= 500;
	
	private static final String SUCCESS_MSG = "操作成功";
	
	private static final String ERROR_MSG = "操作失败";
	
	private Integer code ;
	
	private String msg;
	
	private Object body;
	
	
	private Result(Integer code, String msg, Object body) {
		
		this.code = code;
		this.msg = msg;
		this.body = body;
	}
	
	
	public static Result success(Object body){
		return new Result(SUCCESS_CODE,SUCCESS_MSG,body);
	}
	public static Result success(){
		return new Result(SUCCESS_CODE,SUCCESS_MSG,null);
	}
	public static Result error(){
		return new Result(ERROR_CODE,ERROR_MSG,null);
	}
	
	public static Result error(Object body){
		return new Result(ERROR_CODE,ERROR_MSG,body);
	}
	
	public static Result error(String msg,Object body){
		return new Result(ERROR_CODE,msg,body);
	}
}
