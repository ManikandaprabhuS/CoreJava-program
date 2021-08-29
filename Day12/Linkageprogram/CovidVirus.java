package Day12.Linkageprogram;

public class CovidVirus {
	private String name;
	private int year;
	private Vaccination vaccination;

	public CovidVirus(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Vaccination getVaccination() {
		return vaccination;
	}

	public void setVaccination(Vaccination vaccination) {
		this.vaccination = vaccination;
	}

	public CovidVirus(String name, int year, Vaccination vaccination) {
		super();
		this.name = name;
		this.year = year;
		this.vaccination = vaccination;
	}

}
