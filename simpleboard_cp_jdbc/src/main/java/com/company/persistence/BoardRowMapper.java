package com.company.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.company.domain.BoardVO;

//ResultSet rs의 하나의 row와 매핑되는 객체
public class BoardRowMapper implements RowMapper<BoardVO> {

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO vo = new BoardVO();
		vo.setBno(rs.getInt("bno"));
		vo.setTitle(rs.getString("title"));
		vo.setContent(rs.getString("content"));
		vo.setWriter(rs.getString("wirter"));
		vo.setRegdate(rs.getDate("regdate"));
		vo.setUpdateupdate(rs.getDate("updateupdate"));
		return vo;
	}
	
}
