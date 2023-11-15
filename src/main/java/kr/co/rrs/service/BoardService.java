package kr.co.rrs.service;

import kr.co.rrs.vo.BoardVo;

public interface BoardService {
	// 회원 입력
	public void insert(BoardVo boardVo) throws Exception;

	// 회원 조회
	public BoardVo select(int bNo) throws Exception;
}
