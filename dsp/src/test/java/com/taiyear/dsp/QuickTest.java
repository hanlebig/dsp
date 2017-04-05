/**
 * 
 */
package com.taiyear.dsp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taiyear.dsp.simple.controller.SimpleController;

/**
 * @author liul
 * 
 * 可以在此处使用junit test
 * 测试所有的controller service
 * 直接Autowired就好
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = QuickStart.class)
@ImportResource(value = {""})
public class QuickTest {
	
	@Autowired
	SimpleController sc;
	
	@Before
	public void before() {
		System.out.println("开始之前要做一些事情");
	}
	
	@Test
	public void test() {
		System.out.println("测试的时候要做一些事情");
		sc.index("");
	}
	
	@After
	public void after() {
		System.out.println("完成之后再做一些事情");
	}
}
