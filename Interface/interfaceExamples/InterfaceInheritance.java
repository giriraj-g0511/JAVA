package interfaceExamples;

interface parent{
	void fromParent();
}

interface child extends parent{
	void fromChild();
}

class ParentChild implements child{

	@Override
	public void fromParent() {
		System.out.println("fromParent()");
	}

	@Override
	public void fromChild() {
		System.out.println("fromChild()");
	}
	
}


public class InterfaceInheritance {
	public static void main(String[] args) {
		
		ParentChild pc=new ParentChild();
		pc.fromChild();
		pc.fromParent();
		
	}
}
