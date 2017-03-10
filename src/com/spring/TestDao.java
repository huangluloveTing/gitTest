package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestDao implements InitializingBean ,DisposableBean{
	
	public void daoSave(String name) {
		System.out.println("args " + name);
	}
	
	public void init() {
		System.out.println("testDao init.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestDao init.");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("disposable method.");
	}
}
