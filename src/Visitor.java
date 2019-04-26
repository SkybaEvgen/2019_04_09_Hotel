
public class Visitor {
	private String name;
	private String dateOfBirth;
	
	

	public Visitor(String name, String dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}



	@Override
	public String toString() {
		return "Name: " + name + ", Date of Birth: " + dateOfBirth;
	}
	
	

}
