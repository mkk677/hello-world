package com.codingbox.core3.domain.web.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

	@RequestMapping("/response-view-v1")
	public ModelAndView responseViewV1() {
		ModelAndView mav = new ModelAndView("response/hello")
								.addObject("data","hello");
		return mav;
	}
	
	@RequestMapping("/response-view-v2")
	public String reponseViewV2(Model model) {
		model.addAttribute("data","hello");
		return "response/hello";
	}
	/*
	 * String 을 반환하는 경우 - view or http 메시지
	 *  - @ResponseBody 가 없으면 
	 *  : response/hello 로 뷰 리졸버가 실행되어서 뷰를 찾고 렌더링
	 *  - @ResponseBody 가 있으면
	 *  : 뷰 리조보를 실행하지 않고, HTTP 메시지 바디에 직접
	 *  response/hello 라는 문자열을 반환한다.
	 * 
	 */
	@ResponseBody
	@RequestMapping("/response-view-v3")
	public String reponseViewV3(Model model) {
		model.addAttribute("data","hello333333");
		return "response/hello";
	}
	
}
