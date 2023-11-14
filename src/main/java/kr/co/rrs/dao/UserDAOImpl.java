package kr.co.rrs.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rrs.vo.UserVo;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired(required=false)
	private SqlSession sqlSession;
	
	// 회원 입력
	@Override
	public void insert(UserVo userVo) throws Exception {
		sqlSession.insert("userMapper.insert", userVo);
	};

	// 회원 조회
	@Override
	public UserVo select(String id) throws Exception {
		UserVo user = sqlSession.selectOne("userMapper.select",id);
		
		return user;
	};
}
