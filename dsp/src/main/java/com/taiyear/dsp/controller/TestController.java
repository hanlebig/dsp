package com.taiyear.dsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hanle
 * @Time：2017年3月31日 上午10:45:13
 * @version 1.0
 */

@Controller
@RequestMapping("/taiyear")
public class TestController {
	
	
	@RequestMapping("index")
	public String index(){
		
		return "index";
	}

}
