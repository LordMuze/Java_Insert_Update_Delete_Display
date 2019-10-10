package testcl;

public class AlphaClass extends TheClass implements TheInterface {
	
	
	public static void main(String[] args) {
		AlphaClass theClass = new AlphaClass();
		TheInterface theInterface;
		TheClass theOrg;
		theClass.swingObject();
		theClass.swingInterface();
		theClass.swingClass();
		theInterface = theClass;
		theInterface.swingInterface();
		theOrg = theClass;
		theOrg.swingClass();
	}

	@Override
	public void swingInterface() {
		// TODO Auto-generated method stub
		System.out.println("The interface");
	}

	@Override
	public void swingClass() {
		// TODO Auto-generated method stub
		System.out.println("The class");
	}
	public void swingObject() {
		// TODO Auto-generated method stub
		System.out.println("The object");
	}
}
