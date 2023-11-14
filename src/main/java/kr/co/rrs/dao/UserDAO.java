package kr.co.rrs.dao;

import kr.co.rrs.vo.UserVo;

public interface UserDAO {
	// 회원 입력
	public void insert(UserVo userVo) throws Exception;

	// 회원 조회
	public UserVo select(String id) throws Exception;
}
