package com.xiaoqu.wygl.base;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoqu.wygl.enums.CommErrorEnum;
import com.xiaoqu.wygl.util.MyError;
import com.xiaoqu.wygl.util.MyResponse;





public class BaseController {
	
	@Resource
	MessageSource messageSource;
	
	@ExceptionHandler(Throwable.class)
	public @ResponseBody MyResponse<Void> processThrowable(Throwable t){
		MyResponse<Void> response =  new MyResponse<Void>();
		if(t instanceof MethodArgumentNotValidException){
			handler(response,(MethodArgumentNotValidException)t);
		}else if(t instanceof HttpMessageNotReadableException){
			handler(response,(HttpMessageNotReadableException)t);
		}
		return response;
	}

	private void handler(MyResponse<Void> response, HttpMessageNotReadableException t) {
		response.setErrorResponse(CommErrorEnum.Err02);
	}

	private void handler(MyResponse<Void> response, MethodArgumentNotValidException t) {
		BindingResult result = t.getBindingResult();
		List<FieldError> errors = result.getFieldErrors();
		processFieldErrors(response,errors);
	}
	
	private void processFieldErrors(MyResponse<Void> response, List<FieldError> errors) {
		List<MyError> errorList = new ArrayList<MyError>();
		for (FieldError fieldError : errors) {
			MyError error = new MyError();
			error.setCode(CommErrorEnum.Err02.getCode());	//参数异常
			error.setField(fieldError.getField());
			error.setDesc(fieldError.getDefaultMessage());
			errorList.add(error);
		}
		response.setError(errorList);
	}
}
