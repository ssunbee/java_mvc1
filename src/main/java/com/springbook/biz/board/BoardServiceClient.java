package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {

		//1. Spring 컨테이너를 구동한다. 활성화~
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");

		//2. Spring 컨테이너로부터 BardServiceImpl 객체를 Lookup한다
		BoardService boardService = (BoardService)container.getBean("boardService");

		//3.글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("제목입니다요1");
		vo.setWriter("작가입니다요");
		vo.setContent("내가 쓴 똥");
		boardService.insertBoard(vo);

		//4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}

		//5. Spring 컨테이너 종료
		container.close();
		System.out.println("컨테이너 종료!!!");
	}
}
