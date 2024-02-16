package edu.kh.todoList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;

public class TodoListServiceImpl implements TodoListService {

	// 필드
	private TodoListDAO dao = null;
	
	// 기본 생성자
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// TodoListServiceImpl 객체가 생성 될 때
		dao = new TodoListDAOImpl(); // TodoListDAOImpl 객체 생성
	}
	
	
	
	
	
	@Override
	public Map<String, Object> todoListFullView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String todoDetailView(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int todoAdd(String title, String detail) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean todoComplete(int index) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean todoUpdate(int index, String title, String detail) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String todoDelete(int index) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
