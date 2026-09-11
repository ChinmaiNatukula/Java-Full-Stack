package programs;
class Main{
	String name;
	int age;
	Main(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}
public class Student {
	public static void main(String[] args) {
		Main s = new Main("chinmai",20);
		s.display();
		
	}

}
