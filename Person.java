
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
	
	void showPersonInfo(){
		System.out.println("Information about this person: ");
		System.out.print("Name: "+this.name);
		System.out.println(" | ");
		System.out.println("Age: "+this.age);
		System.out.println(" | ");
		if(this.isMale==true){
			System.out.println("Sex: male");
		}else{
			System.out.println("Sex: female");
		}
	}
}
