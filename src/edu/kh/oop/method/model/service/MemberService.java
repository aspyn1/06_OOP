package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	
	// 속성(필드) -> 캡슐화원칙에 의해 private으로 작성
	private Scanner sc = new Scanner(System.in);
	private Member memberInfo = null; // 가입한 회원의 정보를 저장한 변수
	
	// 기능(생성자+메서드)
	
	// 메뉴화면 출력 기능
	public void displayMenu() {
		// 반환형
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		// 무조건 한번은 반복 -> do  while
		do {
			System.out.println("====회원 정보 관리 프로그램====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원정보 조회");
			System.out.println("4. 회원정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			case 1 : System.out.println(signup()); break;
			case 2 : System.out.println("로그인"); break;
			case 3 : System.out.println("회원정보 조회"); break;
			case 4 : System.out.println("회원정보 수엊"); break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
			
			
		}while(menuNum != 0); // menuNum이 0이면 반복 종료
		
	}
	
	// 회원가입 기능
	public String signup() {
		//(반환형)
		// 해당 메소드가 끝나고 호출한 곳으로 돌아갈때
		// String 자료형 값을 가지고 돌아간다는뜻
		
		System.out.println("\n======회원가입======");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memeberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지않으면 회원가입실패
		
		if(memberPw.equals(memberPw2)) {// 일치하는경우
			
			// 입력받은 정보를 이용해서 Member 객체 생성한 후
			// 생성된 객체의 주소를 필드에 있는 memberInfo에 대입
			
			
			
			
			return "회원가입 성공!!";
			
		}else { // 일치하지 않는 경우
			
			return "회원가입 실패!! (비밀번호 불일치)";
			
		}
	}
	
	
	
	
	

}
