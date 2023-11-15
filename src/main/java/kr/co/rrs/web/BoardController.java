package kr.co.rrs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rrs.service.UserService;
import kr.co.rrs.vo.UserVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired(required=false)
	UserService service;
	
	// 회원 화면
	@RequestMapping(value = "/board/boardList")
	public void goBoardList() throws Exception {
		logger.info("goBoardList! go!");
	}
}
