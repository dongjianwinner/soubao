package com.soubao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soubao.pojo.TbItem;
import com.soubao.serviceImpl.TestServiceImpl;

@Controller
public class testController {
	@Autowired
	public TestServiceImpl testService;
	
	@RequestMapping("/soubao/test")
	@ResponseBody
	public List<TbItem> test()
	{
		return testService.testquery();
	}

	public TestServiceImpl getTestService() {
		return testService;
	}

	public void setTestService(TestServiceImpl testService) {
		this.testService = testService;
	}

}
