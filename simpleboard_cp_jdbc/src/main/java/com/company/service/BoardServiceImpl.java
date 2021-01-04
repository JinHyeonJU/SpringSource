package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.domain.BoardVO;
import com.company.persistence.BoardDAO;

@Service("service") //bean(객체) 생성
public class BoardServiceImpl implements BoardService {

	@Autowired //이미 생성된 bean을 주입
	private BoardDAO dao;
	
	@Override
	public int insertBoard(BoardVO vo) {
		return dao.insert(vo)>0?true:false;
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVO getRow(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getList() {
		return dao.getList();
	}

}
