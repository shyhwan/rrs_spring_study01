package kr.co.rrs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rrs.dao.UserDAO;
import kr.co.rrs.service.UserService;
import kr.co.rrs.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required=false)
	private UserDAO dao;
	
	/**
	 * 회원 입력
	 * @param UserVo
	 */
	@Override
	public void insert(UserVo userVo) throws Exception {
		dao.insert(userVo);
	};

	/**
	 * 회원 조회
	 * @param String id
	 * @return UserVo
	 */
	@Override
	public UserVo select(String id) throws Exception {
		UserVo user = dao.select(id);
		
		return user;
	};	
}
