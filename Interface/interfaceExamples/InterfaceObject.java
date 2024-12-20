package interfaceExamples;

interface interfaceObject1{
	void method();
}

class ImplementsInterfaceObject1 implements interfaceObject1{
	@Override
	public void method() {
		System.out.println("From method implemented in ImplementsInterfaceObject1");
	}
	
	public void classMethod() {
		System.out.println("from class method");
	}
	
}

public class InterfaceObject {

	public static void main(String[] args) {
		interfaceObject1 i1=new ImplementsInterfaceObject1();
		i1.method();
		interfaceObject1 i2= new interfaceObject1() {

			@Override
			public void method() {
				System.out.println("from interface abstract method implemented in driver");
			}
		} ;
		
		i2.method();
		System.out.println(i2);
		// it will give error because i1 is upcasted and we cant access the child class members
//		i1.classMethod();
	}
	
	
}
