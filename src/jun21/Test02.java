package jun21;

class SuperObject {
	public void paint() {
		SubObject.draw();
	}

	public static void draw() {
		SubObject.draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject {
	public void paint() {
		super.draw();
	}

	public static void draw() {
		System.out.println("Sub Object");
	}
}

public class Test02 {
	public static void main(String[] args) {
		SuperObject a = new SubObject();
		a.paint();
	}
}
