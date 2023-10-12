package interf;

// 인터페이스 만들기
// 인터페이스는 추상 메소드만 들어간다.
// ctrl + d: 한줄 지우기

abstract class Hero {// 추상 클래스: 인스턴스 x, 상속용도로만 존재
	String name;
}

// 인터페이스: 각종 기능(추상 메소드들)이 인터페이스 안에 들어간다.
interface Do{
	// 상수만 가능
	static final int NUMBER = 150;
	// 추상 메소드: 상속 받는 자식들은 강제로 구현
	public void attack();// 추상 메소드만 오니까
	public void eat();
	public void sleep();
}

interface Fly{
	public void fly();
}

class Ironman extends Hero implements Do, Fly{// 다중상속
	//Hero 상속만 받음 + 인터페이스 구현
	@Override
	public void attack() {
		
	}

	@Override
	public void eat() {
		
	}

	@Override
	public void sleep() {
		
	}

	@Override
	public void fly() {
		
	}

}
class Hulk extends Hero implements Do {

	@Override
	public void attack() {
		
	}

	@Override
	public void eat() {
		
	}

	@Override
	public void sleep() {
		
	}
}

class Spiderman extends Hero implements Do, Fly{

	@Override
	public void attack() {
		
	}

	@Override
	public void eat() {
		
	}

	@Override
	public void sleep() {
		
	}

	@Override
	public void fly() {
		
	}

}

public class Inter01 {
	public static void main(String[] args) {
		Ironman ironman = new Ironman();
		ironman.fly();
		
		Hulk hulk = new Hulk();
		// hulk.fly();
	}

}
