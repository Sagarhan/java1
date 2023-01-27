	package in.co.inheritence;

public class testShape {
	public static void main(String[] args) {
		Shape S = new circle();
		S.setColor("red");
		S.setBorderwidth(5);

		System.out.println(S.getColor());
		System.out.println(S.getBorderwidth());

		Shape S1 = new trengle();
		S1.setColor(" black");
		S1.setBorderwidth(10);

		System.out.println(S1.getColor());
		System.out.println(S1.getBorderwidth());

		Shape S2 = new rectengle();

		S2.setColor("blue");
		S2.setBorderwidth(40);
	

		System.out.println(S2.getColor());
		System.out.println(S2.getBorderwidth());

	}
}
