package com.company.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company.domain.BoardVO;

// @Repository : bean 생성(=new BoardDAO())

@Repository
public class BoardDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(BoardVO vo) {
		System.out.println("====> Spring JDBC insert");

		String sql = "insert into spring_board(bno,title,content,writer) "
				+ "values(seq_board.nextval,?,?,?)";
		int result = jdbcTemplate.update(sql, vo.getTitle(), vo.getTitle(), vo.getContent());

		return result;
	}


	public int update(BoardVO vo) {
		System.out.println("====> Spring JDBC update");

		String sql = "update spring_board set title=?, content=?, updatedate=sysdate, where bno=?";

		int result = jdbcTemplate.update(sql, vo.getTitle(), vo.getContent(), vo.getBno());

		return result;
	}

	public int delete(BoardVO vo) {
		System.out.println("====> Spring JDBC delete");

		String sql = "delete form spring_board where bno=?";
		int result = jdbcTemplate.update(sql, vo.getBno());

		return result;
	}
	
	public BoardVO getRow(int bno) {
		System.out.println("====> Spring JDBC getRow");

		String sql = "select * from spring_board where bno=?";

		Object[] args = {bno};

		//queryForObject => 행이 한개일 때
		BoardVO vo = jdbcTemplate.queryForObject(sql, new BoardRowMapper());

		return vo;
	}
	
	public List<BoardVO> getList() {

		String sql = "select * from spring_board";
		//query => 쿼리 실행 결과를 목록으로 가져올 때 사용
		return jdbcTemplate.query(sql, new BoardRowMapper());
	}
}
