
public class Booking {
	private String dateStart;
	private String dateEnd;
	private int day;
	//Person
	//Room
	public Booking(String dateStart, String dateEnd, int day) {
		super();
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.day = day;
	}
	@Override
	public String toString() {
		return "date Start: " + dateStart + ", date End: " + dateEnd + ", Booked nights: " + day;
	}

	
	
}
