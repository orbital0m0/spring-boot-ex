package je.spring.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import je.spring.domain.BoardVO;

@RestController
public class BoardController {

	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : " + name;
	}
	
	@GetMapping("/getBoard")
	public BoardVO getboard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("테스트 제목");
		board.setWriter("테스터");
		board.setContent("테스트 내용");
		board.setRegDate(new Date());
		board.setCnt(0);
		return board;
	}

}
