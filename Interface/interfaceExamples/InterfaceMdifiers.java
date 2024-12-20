package interfaceExamples;

sealed interface sealedInterface permits classA, nonSealedInterface {
	static void display() {
		System.out.println("display from sealedInterface");
	}
	
	default void print() {
		System.out.println("print from sealedInterface");
		show();
	}
	
	default void write() {
		System.out.println("write from sealedInterface");
	}
	
	private void show() {
		System.out.println("show from sealedInterface");
	}
	
	void type();
}

non-sealed class classA implements sealedInterface {

	@Override
	public void type() {
		System.out.println("type from classA");
	}
	
}



non-sealed interface nonSealedInterface extends sealedInterface {
	@Override
	default void print() {
		System.out.println("print from nonsealeInterface");
	}
}


class classB implements nonSealedInterface{
	@Override
	public void type() {
		System.out.println("type from classA");
		System.out.println(super.getClass()+" from classB");
	}
}

abstract class newClass{
	int a=10;
	void newClassMethod() {
		System.out.println("newClass method");
		System.out.println(super.getClass());
	}
}

public class InterfaceMdifiers {
	public static void main(String[] args) {
		classA ca=new classA();
		ca.print();		
		sealedInterface.display();
		System.out.println(ca.getClass()+" is from main for classA");
		
		System.out.println("==========================");
		
		classB cb=new classB();
		cb.print();
		cb.write();
		sealedInterface.display();
		cb.type();
		System.out.println(cb.getClass()+" is from main for classB");
		
		System.out.println("============================");
		
		newClass nc=new newClass(){};
		System.out.println(nc.getClass());
		System.out.println(nc.a);
		nc.newClassMethod();
	}
}
