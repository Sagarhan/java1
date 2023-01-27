package in.co.polymorphism;

public class testShape1 {
	public static void main(String[] args) {

		rectengle1 r = new rectengle1(234, 22);
		System.out.println(r.area1());

		trengle1 t = new trengle1(22, 55);
		System.out.println(t.area2());

		circle1 C = new circle1(200);
		System.out.println(C.area3());
	}

}
