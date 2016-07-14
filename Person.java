
public class Person {
	String name;
	int age;
	boolean isMale;

	Person(String name, int age, boolean isMale) {
		if (name != null && (!name.equals(""))) {
			this.name = name;
		}else{
			System.out.println("Enter a valid name.");
		}
		if (age > 0) {
			this.age = age;
		}else{
			System.out.println("Enter a valid age.");
		}
		this.isMale = isMale;
	}
}
