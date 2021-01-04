package com.company.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.domain.MemberVO;

import static com.company.persistence.JDBCUtil.*;

@Repository //DB작업
public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public int insert(MemberVO member) {
		int rs=0;
		try {
			String sql = "insert into memberTBL(userid,password,name,gender,email) values(?,?,?,?,?)";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getGender());
			pstmt.setString(5, member.getEmail());
			rs = pstmt.executeUpdate();
			if(rs>0)
				commit(con);
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return rs;
	}
	public int update(MemberVO member) { //비밀번호 변경
		int rs=0;
		try {
			String sql = "update memberTBL set password=? where userid=?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, member.getUserid());
			pstmt.setString(1, member.getPassword());
			rs = pstmt.executeUpdate();
			if(rs>0)
				commit(con);
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return rs;
	}
	public int delete(MemberVO member) { //userid,password일치시 삭제
		int rs=0;
		try {
			String sql = "delete from memberTBL where userid=? and password=?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getPassword());
			rs = pstmt.executeUpdate();
			if(rs>0)
				commit(con);
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}		
		return rs;
	}
	public MemberVO getRow(MemberVO member) { //userid,password 일치시 가져오기
		MemberVO vo = null;
		try {
			String sql = "select * from memberTBL where userid=? and password=?";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, member.getUserid());
			pstmt.setString(1, member.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVO(rs.getString(1),
						rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5));
			}
				commit(con);
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		
		return vo;
	}
	public List<MemberVO> getList() {
		List<MemberVO> list = new ArrayList<>();
		try {
			String sql = "select * from memberTBL";
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserid(rs.getString("userid"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setGender(rs.getString("gender"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		
		return list;
	}
}
