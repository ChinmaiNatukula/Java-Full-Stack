
package programs;
class Student1{
	String name;
	int age;
	Student1(){
		name="unknown";
		age=0;
	}
	Student1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void StudentDetails() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}

public class details {
	public static void main(String[] args) {
		Student1 s=new Student1();
		Student1 s1=new Student1("Chinmai",20);
		s.StudentDetails();
		s1.StudentDetails();
	}

}

