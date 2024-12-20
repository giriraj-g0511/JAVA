package interfaceExamples;

interface InterfaceExample1{
	int a=10;
	String b=" is value of a";
	static void pritntA() {
		System.out.println(a+b+" from printA");
	}
	void displayA();
	
	default void showA() {
		System.out.println(a+b+" from showA");
	}
	
}

class InterfaceExample1Class implements InterfaceExample1{
	@Override
	public void displayA() {
		System.out.println(a+b+" from displayA");
	}
}

public class InterfaceVariables {
	public static void main(String[] args) {
		InterfaceExample1Class ie1=new InterfaceExample1Class();
		ie1.displayA();
		System.out.println();
		ie1.showA();
		System.out.println();
		System.out.println(ie1.a+ie1.b);
		System.out.println();
		InterfaceExample1.pritntA();
		System.out.println(InterfaceExample1.class);
		System.out.println(InterfaceVariables.class);
		
	}
}
