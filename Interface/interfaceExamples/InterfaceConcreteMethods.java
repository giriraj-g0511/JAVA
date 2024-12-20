package interfaceExamples;

interface InterfaceMethods{
	void abstractMethod();
	static void concreteMethod() {
		System.out.println(" static concrete method");
	}
	
}

class InterfaceMethodsDriver implements InterfaceMethods{

	@Override
	public void abstractMethod() {
		System.out.println("form implemented abstract method");
	}
	
	public void concreteCall() {
		InterfaceMethods.concreteMethod();
	}
	
}
public class InterfaceConcreteMethods {
	
	public static void main(String[] args) {
		InterfaceMethodsDriver i1=new InterfaceMethodsDriver();
		i1.abstractMethod();
		i1.concreteCall();
	}
	
}
