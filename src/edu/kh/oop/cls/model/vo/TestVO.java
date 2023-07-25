package edu.kh.oop.cls.model.vo;

class TestVO {
	
// 접근제한자 -> (default) : 같은 패키지 내에서만 import 가능함을 나타냄
// 자바에서 ()은 무조건 생략을 뜻 함
	
	
// Student와 같은 패키지에 있기 때문에
// -> public, protected, (default) 3개는 접근 가능
	public void ex() {
		
		Student std = new Student();
		
		System.out.println(std.v1);
		System.out.println(std.v2);
		System.out.println(std.v3);
		// System.out.println(std.v4); 
		// private : 같은 패키지라도 생성된 클래스 내부에서만 접근 가능
	}
	

}
