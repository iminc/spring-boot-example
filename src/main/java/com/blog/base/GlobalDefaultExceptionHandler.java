package com.blog.base;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Object defaultErrorHandler(HttpServletRequest req, HttpServletResponse res , Exception e)  {
		Map<String, Object> result = new HashMap<>();
		result.put("message", e.getLocalizedMessage());
		result.put("error", e.getMessage());
		result.put("status", res.getStatus());
		return result;
	}
}
