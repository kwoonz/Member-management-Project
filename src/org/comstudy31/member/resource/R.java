package org.comstudy31.member.resource;

import java.util.Scanner;

import org.comstudy31.member.view.Delete;
import org.comstudy31.member.view.End;
import org.comstudy31.member.view.Input;
import org.comstudy31.member.view.List;
import org.comstudy31.member.view.MainActivity;
import org.comstudy31.member.view.MemberView;
import org.comstudy31.member.view.Modify;
import org.comstudy31.member.view.Search;

public class R {
	// title of view pages 뷰페이지의 제목
	public static final String titleInput = "::: 입력 기능 :::";
	public static final String titleList = "::: 회원 목록 :::";
	public static final String titleSearch = "::: 검색 기능 :::";
	public static final String titleModify = "::: 수정 기능 :::";
	public static final String titleDelete = "::: 삭제 기능 :::";
	public static final String titleEnd = "::: 프로그램 종료 :::";
	public static final String titleApp = "::: 회원관리 프로그램 :::";
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static final MemberView input = new Input();
	public static final MemberView List = new List();
	public static final MemberView search = new Search();
	public static final MemberView modify = new Modify();
	public static final MemberView delete = new Delete();
	public static final MemberView end = new End();
	
	public static final MainActivity mainActivity = new MainActivity();
	
}
