package co.micol.prj20220504.menu;

import java.util.Date;
import java.util.Scanner;

import co.micol.prj20220504.dto.StudentVO;
import co.micol.prj20220504.serive.StudentService;

public class Menu {
	
	//멤버 변수 선언
	//생성자 선언
	//멤버 매소드() 정의
	private Scanner sc = new Scanner(System.in);
	private StudentService dao = new StudentService(); //학생의 CRUD 처리객체
	
	
	public Menu() {		
	}
	
	
	private void mainTitle() {
		System.out.println("======================================");
	    System.out.println("====1. 학 사 관 리======================");
	    System.out.println("====2. 공 지 관 리======================");
	    System.out.println("====3. 종      료======================");
	}
	
	private void lmsTitle() {
		
		System.out.println("===========학 사 관 리==================");
	    System.out.println("====1. 전체학생 조회======================");
	    System.out.println("====2. 학 생 조 회 ======================");
	    System.out.println("====3. 학 생 등 록======================");
	    System.out.println("====4. 학 생 수 정======================");
	    System.out.println("====5. 학 생 삭 제======================");
	    System.out.println("====6. 학 생 등 록======================");
	    System.out.println("======================================");
		
		
		
	}
	
	
	private void noticeTitle() {
		
		System.out.println("==============공 지 관 리==============");
	    System.out.println("====1. 공 지 목 록======================");
	    System.out.println("====2. 공 지 조 회 =====================");
	    System.out.println("====3. 공 지 등 록======================");
	    System.out.println("====4. 공 지 수 정======================");
	    System.out.println("====5. 공 지 삭 제======================");
	    System.out.println("====6. 돌 아 가 기======================");
	    System.out.println("======================================");
		
		
		
		
	}
	
	private void mainMeun() {
		boolean b =false;//초기 값을 관례로 false라고함.
		
		do {
			mainTitle();
			System.out.println("원하는 작업을 선택하세요");
			int code = sc.nextInt();
			switch(code) {
			case 1:
				lmsMenu();
				break;
			case 2:
				noticeMenu();
				break;
			case 3:
				b=true;
				sc.close();
				System.out.println("Good bye~~~~~~~~~~~~~~");
				break;
				
			
			}
			
		}while(!b);
	
	}


	private void noticeMenu() {
		
boolean b =false;//초기 값을 관례로 false라고함.
		
		do {
			noticeTitle();
			System.out.println("원하는 작업을 선택하세요");
			int code = sc.nextInt();
			switch(code) {
			case 1:
				System.out.println("전체공지 목록을 보여준다.");
				break;
			case 2:
				System.out.println("공지조회 내역을 보여준다.");
				break;
			case 3:
				System.out.println("공지사항을 등록한다");
				break;
			case 4:
				System.out.println("공지사항을 수정한다.");
				break;
			case 5:
				System.out.println("공지사항을 삭제한다.");
				break;
			case 6:
				b=true;
				System.out.println("Good bye~~~~~~~~~~~~~~");
				break;
		
			}
		}while(!b);
		
	}


	private void lmsMenu() {
		
boolean b =false;//초기 값을 관례로 false라고함.
		
		do {
			lmsTitle();
			System.out.println("원하는 작업을 선택하세요");
			int code = sc.nextInt();
			switch(code) {
			case 1:
				dao.selectList();
				
				break;
			case 2:
				System.out.println("학생조회 내역을 보여준다.");
				String id = sc.next();
				dao.selectStudent(id);
				break;
			case 3: //sc \n을삭제하기위해
				
				sc.nextLine();   //sc \n 을 삭제하기 위해
				System.out.println("학생아이디를 입력하세요.");
				String nid = sc.nextLine();
				System.out.println("학생이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("학생전공을 입력하세요.");
				String major = sc.nextLine();
				System.out.println("학생전화번호를 입력하세요.");
				String address = sc.nextLine();
				System.out.println("학생주소를 입력하세요.");
				String tel = sc.nextLine();
				System.out.println("학생생년월일를 입력하세요.");
				String birthday = sc.nextLine();
				StudentVO vo = new StudentVO(nid, name, major, address, tel,java.sql.Date.valueOf(birthday));
				dao.insertStudent(vo);
				break;
				
			case 4:
				System.out.println("한명 학생을 수정한다.");
				break;
			case 5:
				System.out.println("한명 학생을 삭제한다.");
				break;
			case 6:
				b=true;
			
				break;
		
			}
			
		}while(!b);
		
	
	}
	
	
	public void run() {
		mainMeun();
	}
	
}
