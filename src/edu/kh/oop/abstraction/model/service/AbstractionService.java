package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	public void ex1() {
		// 국민 개체 만들기
		People p1 = new People(); // 패키지가 다르기때문에 import 해와야함
		// People p1 : People 객체에 주소를 저장하여 참조하는 변수 p1을 만듬
		// new People() : 새로운 People 객체를 Heap 영역에 생성한 것
		
		// **클래스 이름이 자료형처럼 사용된다.
		// ** 그래서 클래스를 "사용자 정의 자료형"이라고 한다! **
		
		//p1.name = "홍길동";		
		p1.setName("홍길동"); // setter
		
		//p1.age = 25;
		p1.setAge(25);
		
		//p1.gender = '남';
		p1.setGender('남');
		
		//p1.phone = "010-1234-5678";
		p1.setPhone("010-1234-5678");
		
		//p1.pNo = "200303-1234567";
		p1.setpNo("010-1234-5678");
		
		//p1.address = "서울시 중구 남대문로 120 대일빌딩 3층 E강의장";
		p1.setAddress("서울시 중구 남대문로 120 대일빌딩 3층 E강의장");
		
		// p1.으로 가져오는 방식은 직접 접근 방식으로 캡슐화(정보은닉)이 전혀 되지 않은 상태이다.
		// 실제로는 이렇게 코딩하지 않는다.
		
		System.out.println("p1.name : " + p1.getName()); // getter
		System.out.println("p1.age : " + p1.getAge());
		System.out.println("p1.gender : " + p1.getGender());
		System.out.println("p1.phone : " + p1.getPhone());
		System.out.println("p1.pNo : " + p1.getpNo());
		System.out.println("p1.address :" + p1.getAddress());
		
		System.out.println();
		
		People p2 = new People();
		
		p2.setName("최지은");
		p2.setGender('여');
		p2.setpNo("222222-2222222");
		p2.setAddress("서울 용산구 원효로");
		p2.setPhone("010-5555-5555");
		p2.setAge(30);
		
		System.out.println("p2 name : " + p2.getName());
		System.out.println("p2 gender : " + p2.getGender());
		System.out.println("p2 pNo : " + p2.getpNo());
		System.out.println("p2 address : " + p2.getAddress());
		System.out.println("p2 phone : " + p2.getPhone());
		System.out.println("p2 age : " + p2.getAge());
		
	}

}
