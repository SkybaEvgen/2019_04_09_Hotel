
public class Room {
	private int number;
	private String categoryAccommodation;					//категория по принципу размещения
	private String categoryComfort;							//категория по уровню комфортности
	private int roomArea;
	private int price;
	
	public Room(int number, String categoryAccommodation, String categoryComfort, int roomArea, int price) {
		super();
		this.number = number;
		this.categoryAccommodation = categoryAccommodation;
		this.categoryComfort = categoryComfort;
		this.roomArea = roomArea;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}
	
	public int getPrice() {
		return price;
	}

	public String getCategoryAccommodation() {
		return categoryAccommodation;
	}

	public String getCategoryComfort() {
		return categoryComfort;
	}

	public int getRoomArea() {
		return roomArea;
	}

	@Override
	public String toString() {
		return "Price: "+price+" eur."+", Numbe: " + number + ", Category of accommodation: " + categoryAccommodation + ", Category of comfort: " + categoryComfort + ", Room area: " + roomArea;
	}
	
	public AddBooking addBooking(Booking booking,Visitor visitor){		//метод, который бронирует номер
		return new AddBooking(this, booking, visitor);					//возвращает забронированный номер
	}

}
