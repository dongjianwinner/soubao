package com.soubao.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.soubao.mapper.TbItemMapper;
import com.soubao.pojo.TbItem;
import com.soubao.pojo.TbItemExample;

@Repository
public class TestDao {
	@Autowired
     private TbItemMapper tbItemMapper;
	
	/*PageHelper 方法使用了静态的 ThreadLocal 参数，分页参数和线程是绑定的。

	只要你可以保证在 PageHelper 方法调用后紧跟 MyBatis 查询方法，这就是安全的。因为 PageHelper 在 finally 代码段中自动清除了 ThreadLocal 存储的对象。*/
	public List<TbItem>  testQuery()
	{
		TbItemExample tbItemExample = new TbItemExample();
		PageHelper.startPage(1, 50);
		List<TbItem> list = tbItemMapper.selectByExample(tbItemExample);
		return list;
	}

	public TbItemMapper getTbItemMapper() {
		return tbItemMapper;
	}

	public void setTbItemMapper(TbItemMapper tbItemMapper) {
		this.tbItemMapper = tbItemMapper;
	}
	
	
}
