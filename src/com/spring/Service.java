package com.spring;

public class Service {
	
	private TestDao testDao;

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	public void serviceTest(String args) {
		System.out.println("agrs " + args);
		this.testDao.daoSave(args);
	}
}
