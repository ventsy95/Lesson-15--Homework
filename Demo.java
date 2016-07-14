
public class Demo {

	public static void main(String[] args) {
		Person[] people = new Person[10];
		Person firstPerson = new Person("Joro", 20, true);
		Person secondPerson = new Person("Ivanka", 22, false);
		Student firstStudent = new Student("Mario", 21, true, 3.6);
		Student secondStudent = new Student("Ivelina", 19, false, 4.78);
		Employee firstEmployee = new Employee("Vasilka", 35, false, 15.90);
		Employee secondEmployee = new Employee("Iliqn", 17, true, 13);

		people[0] = firstPerson;
		people[1] = secondPerson;
		people[2] = firstStudent;
		people[3] = secondStudent;
		people[4] = firstEmployee;
		people[5] = secondEmployee;

		for (int index = 0; index < people.length; index++) {
			if (people[index] != null) {
				if (people[index] instanceof Student) {
					((Student) people[index]).showStudentInfo();
				}
				if (people[index] instanceof Employee) {
					((Employee) people[index]).showEmployeeInfo();
				} 
				if(!(people[index] instanceof Student)&& !(people[index] instanceof Employee)){
					people[index].showPersonInfo();
				}
			} else {
				break;
			}
		}

		for (int index = 0; index < people.length; index++) {
			if (people[index] != null) {
				if (people[index] instanceof Employee) {
					System.out.println("Extra hours money: " + ((Employee) people[index]).calculateOvertime(2));
				}
			} else {
				break;
			}
		}
	}

}
