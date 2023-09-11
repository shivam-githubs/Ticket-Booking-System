package TicketBookingSystem;
public class Theater {
	private String theatre_name;
	private int no_of_seat =500;
	private Ticket qs;
	public Theater(String theater_name) {
		this.theatre_name = theatre_name;
	}
	
	public Ticket getQs() {
		return qs;
	}

	public void setQs(Ticket qs) {
		this.qs = qs;
	}

	public String getTheatre_name() {
		return theatre_name;
	}
	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}
	public int getNo_of_seat() {
		return no_of_seat;
	}
	public void setNo_of_seat(int no_of_seat) {
		this.no_of_seat = no_of_seat;
	}
	
	public void ticket_book()
	{
		if(no_of_seat>=qs.getTicket_book())
		{
			no_of_seat = no_of_seat-qs.getTicket_book();
			System.out.println("Ticket Booked "+qs.getTicket_book());
		}
		else 
		{
			System.out.println("sorry! House Full");
		}
		
	}	
	public void seatAvalbility()
	{
		System.out.println("Reamaing Seat are "+no_of_seat);
	}
	
	public void cancelTicket(int cancel)
	{
		if(qs!=null && cancel<=qs.getTicket_book() )
		{
			no_of_seat += cancel;
			qs.setTicket_book(qs.getTicket_book()-cancel);
			System.out.println("Ticket cancelled successfully!");
		}
		else
			System.out.println("No tickets were booked");
			
	}
	public void showDetail()
	{
		if(qs.getTicket_book()<=0)
		{
			System.out.println("oohh, No tickets");
	
		}
		else
			qs.movieDeail();
	}
}