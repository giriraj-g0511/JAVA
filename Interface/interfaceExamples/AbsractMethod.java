package interfaceExamples;

interface interface1 {
	void firstMethod();

	void secondMethod();
}

abstract class ImplementsInterface1 implements interface1 {
	@Override
	public void firstMethod() {
		System.out.println("firstMethod from ImplementInterface1 class");
	}
	// We implementing first method only and not implementing 2nd method for that we
	// are making class abstract class
}

class implementingClass extends ImplementsInterface1{

	@Override
	public void secondMethod() {
		System.out.println("secondMethod from implementing class");
	}
	
}



public class AbsractMethod {
	public static void main(String[] args) {
		//We cant create direct object of abstract class first we have to implement abstract method then only we creates it object
//		ImplementsInterface1 ii1= new ImplementsInterface1();
		implementingClass iC=new implementingClass();
		iC.firstMethod();
		iC.secondMethod();
		
	}
}
