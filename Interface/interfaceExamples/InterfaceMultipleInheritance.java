package interfaceExamples;

interface GrandParent {
	default void careerGP() {
		System.out.println("GrandParent career");
	}
}

interface Parent1 extends GrandParent {
	default void career() {
		System.out.println("Parent1 career");
	}
}

interface Parent2 extends GrandParent {
	default void career() {
		System.out.println("Parent2 career");
	}
}

class ChildClass extends parent01 implements Parent1, Parent2 {

	@Override
	void careerParent1() {
		super.careerParent1();
	}

	void careerParent2() {
		parent02 p2 = new parent02();
		p2.careerParent2();
	}

	@Override
	public void career() {
		Parent1.super.career();
	}
}

class parent01 {
	void careerParent1() {
		System.out.println("From parent01 class");
	}
}

class parent02 {
	void careerParent2() {
		System.out.println("From parent02 class");
	}
}

public class InterfaceMultipleInheritance {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.career();
		cc.careerGP();
		cc.careerParent1();
		cc.careerParent2();
	}
}
