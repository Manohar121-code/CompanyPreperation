package lenskart;

public class ClassCastExpCheck {
	public static void main(String[] args) {
		ClassCastExpCheck obj = new ClassCastExpCheck();
		A a = new B();
		obj.doIt(a);
		obj.doIt(new B());
	}
	
	public void doIt(A a) {
		System.out.println("doit A a");
		a.print(a);
	}
	
	public void doIt(B b) {
		System.out.println("doit B b");
		b.print(b);
	}
}

class A {
	void print(A a) {
		System.out.println("A Print()");
	}
}

class B extends A {
	void print(B b) {
		System.out.println("B Print()");
	}
}