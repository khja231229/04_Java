package edu.kh.todoList.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.todoList.model.dto.Todo;

public class TodoListDAOImpl implements TodoListDAO{

	// 필드
	
	private final String FILE_PATH = "/io_test/TodoList.dat";
	
	// 파일에 입/출력되는 리스트를 참조할 변수
	private List<Todo> todoList = null; 
	
	// 객체 입/출력 보조 스트림
	private ObjectInputStream  ois = null;
	private ObjectOutputStream oos = null;
	
	
	
	/* 기본 생성자 */
	public TodoListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// 객체 생성 시 TodoList.dat 파일 내용 읽어오기
		// -> 읽어오기 전에 있는지 검사부터!!!
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) { // 파일이 존재 하면
			
			try {
				// 객체 입력 스트림을 이용해서 입력 받기
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				// 읽어온 객체를 ArrayList<Todo>로 강제 형변환(다운캐스팅)
				todoList = (ArrayList<Todo>)ois.readObject();
		
			} finally {
				if(ois != null)	ois.close();
			}
			
			System.out.println("*** 데이터 읽어오기 완료 ***");
			
		} else { // 파일이 존재하지 않으면
			
			// 폴더, 파일 만들기
			File directory = new File("/io_test");
			if( !directory.exists() ) directory.mkdir(); // 폴더 없으면 생성
			// file.createNewFile();
			
			
			// 객체 출력 스트림을 이용해서 파일 생성 + 샘플 데이터 추가
			todoList = new ArrayList<Todo>();
			
			todoList.add( new Todo("자바 공부", "수업 내용 복습하기", false, LocalDateTime.now()) );
			todoList.add( new Todo("CSS 공부" , "수업 내용 복습하기", false, LocalDateTime.now()) );
			todoList.add( new Todo("HTML 공부", "수업 내용 복습하기", false, LocalDateTime.now()) );
			
			try {
				// 객체 출력 스트림 생성 -> 파일이 없다면 자동 생성
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(todoList); // todoList를 파일로 출력
				
			} finally {
				oos.close(); // flush() 내장되어 있어 다 밀어내고 닫기
			}
			
			System.out.println("*** TodoList.dat 파일 생성 완료 ***");
		}
		
	}
	
	
	
	
	
	
	
	
	@Override
	public void saveFile() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Todo> todoListFullView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo todoDetailView(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int todoAdd(Todo todo) throws FileNotFoundException, IOException {
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
	public Todo todoDelete(int index) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}