package kr.co.rrs.service;

import kr.co.rrs.vo.UserVo;

public interface UserService {
	// 회원 입력
	public void insert(UserVo userVo) throws Exception;

	// 회원 조회
	public UserVo select(String id) throws Exception;
}
