package kr.co.rrs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rrs.service.UserService;
import kr.co.rrs.vo.UserVo;

@Controller
@RequestMapping("/user/*")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired(required=false)
	UserService service;
	
	// 회원 화면
	@RequestMapping(value = "/user/goUser")
	public void goUser() throws Exception {
		logger.info("goUser go! go!");
	}
	
	// 회원 로그인
	@RequestMapping(value = "login")
	public void login() throws Exception {
		
	}

	// 회원 상세 조회
	@RequestMapping(value = "userList")
	public void userList() throws Exception {
		
	}	
	
	// 회원 상세 조회
	@RequestMapping(value = "selectUser")
	public UserVo selectUser(String id) throws Exception {
		UserVo user = service.select(id);
		
		return user;
	}
	
	// 회원 가입
	@RequestMapping(value = "signIn")
	public void signIn(UserVo user) throws Exception {
		service.insert(user);
	}	
}
