package day8.hashExamples;

public class project {
	private int Bonus;
	private int ProjectName;

	public project() {
		super();
	}

	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	public int getProjectName() {
		return ProjectName;
	}

	public void setProjectName(int projectName) {
		ProjectName = projectName;
	}

	@Override
	public String toString() {
		return "project [Bonus=" + Bonus + ", ProjectName=" + ProjectName + "]";
	}

}
