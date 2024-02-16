package edu.kh.todoList.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;

// view : 보여지는 부분(내용 출력/키보드 입력) 역할

public class TodoListView {
	
	// 필드
	private TodoListService service = null; // 서비스 참조 변수
	private BufferedReader br = null;       // 키보드 입력 스트림 참조 변수
	
	// 기본 생성자
	public TodoListView() {
		
		// 객체 생성 시 발생되는 예외를 여기서 모아서 처리할 예정
		
		try {
			// 부모 타입 참조변수 = 자식 객체 
			service = new TodoListServiceImpl(); // 다형성 업캐스팅
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	

}
