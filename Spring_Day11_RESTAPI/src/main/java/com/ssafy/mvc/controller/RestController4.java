package com.ssafy.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest4")
public class RestController4 {
	// http://localhost:8080/rest4/board/1
	// http://localhost:8080/rest4/board/2
	// http://localhost:8080/rest4/board/99
	
//	@GetMapping("/board/{id}")
//	public String test1(@PathVariable int id) {
//		return id + ":board";
//	}
	
	@GetMapping("/board/{id}")
	public String test2(@PathVariable("id") int num) {
		return num + ":board";
	}
	
	@GetMapping("/board/{id}/reviews/{rid}")
	public String test3(@PathVariable int id, @PathVariable int rid) {
		return id + ":board, "+ rid + ":review";
	}
}
