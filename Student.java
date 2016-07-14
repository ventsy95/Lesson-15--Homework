
public class Student extends Person {
	private double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score >= 2 && score <= 6) {
			this.setScore(score);
		}
	}

	void showStudentInfo() {
		super.showPersonInfo();
		System.out.print(" | ");
		System.out.println("Score: " + this.getScore());
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
