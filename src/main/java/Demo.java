interface A {
	default void show() {
		System.out.println("show of A...!");
	}
}
interface B {
	default void show() {
		System.out.println("show of B...!");
	}
}

public class Demo implements A, B {
	public void show() {
		//System.out.println("fresh implementation by demo");
		//A.super.show();
		B.super.show();
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.show();
		
	}
}
