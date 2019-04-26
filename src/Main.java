
public class Main {

	public static void main(String[] args) {
		
		Room r1 = new Room(101, "Single", "Suite", 35, 80);
		Room r4 = new Room(101, "Single", "Suite", 40, 85);
		Room r5 = new Room(101, "Single", "Suite", 38, 84);
		Room r2 = new Room(102, "De Luxe", "Double", 53, 120);
		Room r6 = new Room(102, "De Luxe", "Double", 59, 130);
		Room r7 = new Room(102, "De Luxe", "Double", 65, 140);
		Room r3 = new Room(103, "Family room", "Triple", 70, 130);
		Room r8 = new Room(103, "Family room", "Triple", 70, 130);
		Room r9 = new Room(103, "Family room", "Triple", 70, 130);
		Booking b1 = new Booking ("10.06.2019", "20.06.2019", 10);
		Booking b2 = new Booking("25.07.2019", "28.07.2019", 3);
		Booking b3 = new Booking("12.05.2019", "18.05.2019", 5);
		Visitor v1 = new Visitor("Madonna", "16.08.1958");
		Visitor v2 = new Visitor("Sting", "02.10.1951");
		Visitor v3 = new Visitor("Moby", "11.09.1965");
		
//		System.out.println(r1);
//		System.out.println(b1);
//		System.out.println(v1);
//		System.out.println();
		AddBooking adb1 = r1.addBooking(b1, v1);
		AddBooking adb2 = r2.addBooking(b2, v2);
		AddBooking adb3 = r3.addBooking(b3, v3);
		
//		System.out.println(adb1);
//		System.out.println(adb2);
//		System.out.println(adb3);
		System.out.println();
		
		RoomBookingList rl = new RoomBookingList();
		rl.add(adb1);
		rl.add(adb2);
		rl.add(adb3);
		rl.print();
		System.out.println();
		rl.add(adb3, 1);
		rl.print();
		RoomList rml = new RoomList();
		System.out.println();
		rml.add(r1); rml.add(r2); rml.add(r3); rml.add(r4); rml.add(r5); rml.add(r6); rml.add(r7); rml.add(r8); rml.add(r9);
		rml.print();
		
	
	
	
	
	}
}
