
public class Student extends Person {
	private static final int HIGHEST_GRADE = 6;
	private static final int LOWEST_GRADE = 2;
	private double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score >= LOWEST_GRADE && score <= HIGHEST_GRADE) {
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
