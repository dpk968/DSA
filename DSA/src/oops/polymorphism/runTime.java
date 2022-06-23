package oops.polymorphism;

public class runTime {

	public static void main(String[] args) {

		dev d = new dev();
		d.d2();
	}

}

class dpk{
	void d2() {
		System.out.println("I'm in dpk class");
	}
}

class dev extends dpk{
	void d2() {
		System.out.println("I'm in dev class");
	}
}
