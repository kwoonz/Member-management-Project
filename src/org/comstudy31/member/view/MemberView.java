package org.comstudy31.member.view;

import org.comstudy31.member.resource.R;

public abstract  class MemberView extends R{
	// ���κ信 �ִ°� �޾Ƽ� ���� �����ִ°�
	public void display() {
		onCreate();
	}
	
	public abstract void onCreate();




}
