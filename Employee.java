
public class Employee extends Person {
	private static final double COEFFICIENT_FOR_EXTRA_HOURS = 1.5;
	private static final int WORKING_SHIFT_HOURS = 8;
	private static final int LEGAL_AGE_FOR_WORK = 18;
	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary > 0) {
			this.setDaySalary(daySalary);
		}
	}

	double calculateOvertime(double hours) {
		if (this.age < LEGAL_AGE_FOR_WORK) {
			return 0;
		} else {
			return ((this.daySalary / WORKING_SHIFT_HOURS) * COEFFICIENT_FOR_EXTRA_HOURS) * hours;
		}
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

}
