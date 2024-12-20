package interfaceExamples;

interface InterfaceOne{

	public static void hello() {
		System.out.println("Hello from Interface One hello method");
	}
}

interface InterfaceTwo extends InterfaceOne{
	void display();
}

class  abstractClass implements InterfaceTwo{
	
	@Override
	public void display() {
		System.out.println("display method from abstract class display method");
	}

	public void helloCall() {
		InterfaceOne.hello();
	}	
}

public class TwoInterface{
	public static void main(String[] args) {
		abstractClass ab= new abstractClass();
		System.out.println(ab);
		ab.display();
		ab.helloCall();
	}
}