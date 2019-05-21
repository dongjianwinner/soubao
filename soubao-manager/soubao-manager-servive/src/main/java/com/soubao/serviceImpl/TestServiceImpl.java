package com.soubao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soubao.dao.TestDao;
import com.soubao.pojo.TbItem;
import com.soubao.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDao testDao;
	
	@Override
	public List<TbItem> testquery()
	{
		return testDao.testQuery();
		
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	

}
