package kr.co.rrs.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rrs.vo.BoardVo;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired(required=false)
	private SqlSession sqlSession;
	
	// 회원 입력
	@Override
	public void insert(BoardVo boardVo) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVo);
	};

	// 회원 조회
	@Override
	public BoardVo select(int bNo) throws Exception {
		BoardVo board = sqlSession.selectOne("boardMapper.select",bNo);
		
		return board;
	};
}
