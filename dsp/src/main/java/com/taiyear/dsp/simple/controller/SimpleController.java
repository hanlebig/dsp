/**
 * 
 */
package com.taiyear.dsp.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taiyear.dsp.simple.entity.Student;
import com.taiyear.dsp.simple.service.SimpleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author liul
 *
 */
@Controller
@RequestMapping("/simple")
@Api(value = "测试类",tags = "测试接口")
public class SimpleController {
	
	@Autowired SimpleService simpleService;
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	@ApiOperation("测试controller")
	public @ResponseBody Student index(@ApiParam(name = "id",value = "id",required = true) @RequestParam String id) {
		return simpleService.query();
	}
}
