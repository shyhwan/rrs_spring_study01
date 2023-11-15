package kr.co.rrs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rrs.dao.BoardDAO;
import kr.co.rrs.service.BoardService;
import kr.co.rrs.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired(required=false)
	private BoardDAO dao;
	
	/**
	 * 회원 입력
	 * @param UserVo
	 */
	@Override
	public void insert(BoardVo boardVo) throws Exception {
		dao.insert(boardVo);
	};

	/**
	 * 회원 조회
	 * @param String id
	 * @return UserVo
	 */
	@Override
	public BoardVo select(int bNo) throws Exception {
		BoardVo user = dao.select(bNo);
		
		return user;
	};	
}
