
public class AddBooking {
	private Room room;
	private Booking booking;
	private Visitor visitor;
	
	public AddBooking(Room room, Booking booking, Visitor visitor) {
		super();
		this.room = room;
		this.booking = booking;
		this.visitor = visitor;
	}

	@Override
	public String toString() {
		return "Room " + room + ", Booking " + booking+ ", Visitor " + visitor;
	}

}
