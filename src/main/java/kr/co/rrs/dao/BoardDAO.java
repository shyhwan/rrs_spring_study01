package kr.co.rrs.dao;

import kr.co.rrs.vo.BoardVo;

public interface BoardDAO {
	// 회원 입력
	public void insert(BoardVo boardVo) throws Exception;

	// 회원 조회
	public BoardVo select(int bNo) throws Exception;
}
