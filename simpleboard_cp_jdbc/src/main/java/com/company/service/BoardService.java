package com.company.service;

import java.util.List;

import com.company.domain.BoardVO;

public interface BoardService {
	boolean insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
	BoardVO getRow(int bno);
	List<BoardVO> getList();
}
