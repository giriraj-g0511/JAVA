package interfaceExamples;

interface InterfaceExample01{
	default void hello() {
		System.out.println("hello from interfaceExample01 defailt method");
	}
	static void namaste() {
		System.out.println("Namaste from interfaceExample01 static method");
	}
}

public class AbstractInterface implements InterfaceExample01{
	public static void main(String[] args) {
		InterfaceExample01.namaste();
		
		System.out.println();
		
		InterfaceExample01 ie1=new InterfaceExample01() {
		};
		ie1.hello();
	}
}
