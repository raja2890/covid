package com.covid19.covid19.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid19.covid19.response.ResponseObj;
import com.covid19.covid19.service.Covid19InfoService;

@RestController
@RequestMapping("/covid19-info1")
public class Covid19InfoController {
	
	@Autowired
	Covid19InfoService infoService;
	
	@PostMapping("/statewise-info")
	public ResponseObj statewise() {
		return infoService.stateWiseInfo();
	}

}
