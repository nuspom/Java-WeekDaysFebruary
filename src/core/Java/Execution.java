package core.Java;

public class Execution {
	public static void main (String [] args) {
		//Object Creation Of A Class
		Computer refVar = new Computer();
		//Class Name + reference variable = new + Constructor Name
		refVar.year= 1;
		//Class Name + reference variable = new Constructor
		refVar.model = "Asus";
		System.out.println(refVar.model);
		
		Computer refVar2 = new Computer(2019);
	}
}
