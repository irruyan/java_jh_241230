package kr.kh.tmp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import kr.kh.tmp.service.PostService;

public class AdminController {
	
	@Autowired
	private PostService postService;
}
