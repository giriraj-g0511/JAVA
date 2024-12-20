package interfaceExamples;


interface FunctionInterface{
	void hello();
	
}

class FunctionalInterfaceDriver implements FunctionInterface{
	
	@Override
	public void hello() {
		System.out.println("From FunctionalInterface class display method");
	}	
}

class Driver{
	public static void main(String[] args) {
		FunctionalInterfaceDriver fi=new FunctionalInterfaceDriver();
		fi.hello();
	}
}
public class FunctionalInterface {

}
