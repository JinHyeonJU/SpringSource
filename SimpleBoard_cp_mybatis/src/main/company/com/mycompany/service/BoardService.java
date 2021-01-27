package com.mycompany.service;

import java.util.List;

import com.mycompany.domain.BoardVO;

public interface BoardService {
	
	int InsertBoard(BoardVO vo);
	int UpdateBoard(BoardVO vo);
	int DeleteBoard(BoardVO vo);
	
	BoardVO getRow(int bno);
	List<BoardVO> getList();
}
