package org.comstudy31.member.test;

import org.comstudy31.member.resource.R;

public class TestAppMain extends R{
	
	public TestAppMain() {
		viewTest();
	}
	

	private void viewTest() {
		mainActivity.setContentView(modify);
		
	}


	public static void main(String[] args) {
		new TestAppMain();

	}

}
