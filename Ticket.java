package TicketBookingSystem;

public class Ticket {
	private String movie_name;
	private int ticket_book;
	
	public Ticket(String m, int b)
	{
		movie_name=m;
		ticket_book = b;
	}
	public String setMovieName()
	{
		return movie_name;
	}
	public int getTicket_book() {
		return ticket_book;
	}
	public void setTicket_book(int ticket_book) {
		this.ticket_book = ticket_book;
	}
	public void getDeatail()
	{
		System.out.println("Movie Name "+movie_name);
		System.out.println("Ticket Book "+ticket_book);
	}
	public void movieDeail()
	{
		
		System.out.println("Movie Name " +movie_name);
		System.out.println("You have  "+ticket_book+" Tickets");
	}
	
}
