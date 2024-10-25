package com.ssafy.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.service.BoardService;

@Controller
public class BoardController {
	private BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		// 서비스를 통해서.. 게시글들을 가져와야 한다.
		List<Board> boards = boardService.getBoardList();
		model.addAttribute("list", boards);
		return "/board/list";
	}
}
