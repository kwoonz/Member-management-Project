package org.comstudy31.member.view;

import org.comstudy31.member.resource.R;

public abstract  class MemberView extends R{
	// 메인뷰에 있는걸 받아서 실행 시켜주는것
	public void display() {
		onCreate();
	}
	
	public abstract void onCreate();




}
