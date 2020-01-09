package inheritance;

//Based 클래스를 상속받은 Derived 클래스
public class Derived extends Based {
	//상위 클래스에 default constructor 가 없는 경우에는 생성자를 만들고 super를 이용해서
	//상위 클래스의 생성자를 호출해야 합니다.
	//프레임워크를 사용하면 상위 클래스를 우리가 수정할 수 없기 때문에 
	//하위 클래스에서 해결을 해야 합니다.
	//이런식의 코드가 Android Studio(Android Native App 개발을 위한 Java Framework)
	//에서 많이 사용됩니다.
	public Derived() {
		//new Based(10) 과 동일한 코드
		super(10);
	}
	
	//상위 클래스에 print() 가 존재하는데 하위 클래스에서 다시 만드는 것을 Method Overriding
	//이라고 합니다.
	@Override //이 메소드가 오버라이딩 된 메소드라는 것을 알아볼 수 있습니다.
	public void print() {
		System.out.println("하위 클래스의 print");
	}
	
	public void method() {
		print(); //앞에 아무것도 붙지 않았기 때문에 자신의 클래스에서부터 찾아 갑니다.
		//자신의 클래스에 만든 print()
		System.out.println("======================");
		
		super.print(); //상위 클래스에서 print()를 찾습니다.
		//Based에 만든 print()
		
	}
	
	
	//메소드
	public void disp() {
		//num = 10;  //num은 private 멤버라서 보이지 않는다고 에러 메시지
		//protected로 변경할 것인지 물어봅니다.
		
		title = "제목";
		content = "내용";
		readcnt = 0;
	}
}
