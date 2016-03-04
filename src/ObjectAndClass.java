

public class ObjectAndClass {	

	public static void main(String[] args) {
		Students stu1 = new Students();
		Students stu2 = new Students();
		
		stu1.id = 1;
		stu1.name = "Ulf Samuelson";
		stu1.tuition = 3200;
		stu1.major = "QA";
				
		stu2.id = 2;
		stu2.name = "John Johnson";
		stu2.tuition = 3000;
		stu2.major = "QA";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name + " - " + stu2.major);
		System.out.println(stu2.getName() + " - " + stu2.major);
	}
}
		
class Students {
	int id = 0;
	String name = "StudentName";
	int tuition = 0;
	String major = "Major";
	//Or this way
	public String getName() {
		return this.name;		
		}	
	}


