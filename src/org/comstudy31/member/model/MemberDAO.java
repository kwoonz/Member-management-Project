package org.comstudy31.member.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.List;


public class MemberDAO {
	// DTO를 저장하는 List 생성
	private static final Vector<MemberDTO> memList = new Vector<MemberDTO>();
	
	// 상세보기
	public List<MemberDTO> selectAll() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Collections.copy(list, memList);
		return list;
	}
	
	// search
	public MemberDTO selectOn(MemberDTO dto) {
		MemberDTO member = null;
		int i = memList.indexOf(dto);
		if(i != -1) {
			member = memList.get(i);
		}
		return member;
	}
	
	// 이름으로 검색
	public List<MemberDTO> selectByName(String name) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		for(int idx = 0; idx < memList.size(); idx++) {
			MemberDTO mem = memList.get(idx);
			if(name.equals(mem.getName())) {
				list.add((MemberDTO)mem.clone());
			}
		}
		return list;
	}
	
	public boolean delete(MemberDTO dto) {
		return memList.remove(dto);
		
	}
	
	
	public MemberDTO update(MemberDTO dto) {
		int i = memList.indexOf(dto);
		if(i != -1) {
			return memList.set(i, dto);
		} else {
			return null;
		}
		
	}
	
	// 데이터 불러오기
	public List<MemberDTO> fileLoad() {
		return null;
	}
	
	public boolean filesava(List<MemberDTO> list) {
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
