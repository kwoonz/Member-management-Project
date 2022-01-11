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
	// title of view pages ���������� ����
	public static final String titleInput = "::: �Է� ��� :::";
	public static final String titleList = "::: ȸ�� ��� :::";
	public static final String titleSearch = "::: �˻� ��� :::";
	public static final String titleModify = "::: ���� ��� :::";
	public static final String titleDelete = "::: ���� ��� :::";
	public static final String titleEnd = "::: ���α׷� ���� :::";
	public static final String titleApp = "::: ȸ������ ���α׷� :::";
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static final MemberView input = new Input();
	public static final MemberView List = new List();
	public static final MemberView search = new Search();
	public static final MemberView modify = new Modify();
	public static final MemberView delete = new Delete();
	public static final MemberView end = new End();
	
	public static final MainActivity mainActivity = new MainActivity();
	
}
