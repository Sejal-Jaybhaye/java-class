public class Person{
	int age;
	String name;

	public Person(int a, String n) {
		age = c;
		name = d;
	}

	public void drive(){
		if  (age < 18) {
			System.out.println("Can Draw");
		}
		else {
			System.out.println("LEARN DRAWING");
		}
	}
	
	//main method
	public static void main(String[] args){
		Person p1 = new Person(18, "shubhangi");
		Person p2 = new Person(16, "SEJAL");
		p1.drive();
		p2.drive();
	}
}