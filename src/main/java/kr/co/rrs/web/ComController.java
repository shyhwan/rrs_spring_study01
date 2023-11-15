package kr.co.rrs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/com/*")
public class ComController {

	private static final Logger logger = LoggerFactory.getLogger(ComController.class);

	// 메인 화면
	@RequestMapping(value = "/com/mainHome")
	public void mainHome() throws Exception {
		logger.info("Wellcom Home!");
	}

	// 로그인 화면
	@RequestMapping(value = "/com/login")
	public void goLogin() throws Exception {
		logger.info("loginPage");
	}	
}
