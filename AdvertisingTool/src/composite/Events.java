package composite;

public class Events extends OrganisationalAds{

	private String type;
	private Double ticketPrice;
	private String date;
	public Events(String type, Double price, String date, String organisationName, String link, String adName, String description) {
		super(organisationName, link, adName, description);
		// TODO Auto-generated constructor stub
		
		this.type = type;
		this.ticketPrice = price;
		this.date = date;
		
		info =  this.type + " " + this.adName + " | " +
				" By : " + this.organisationName + "|" +
				" On : " + this.date + "|" +
				" Ticket : " + this.ticketPrice + "|" +
				" Description " + this.description;
				
	}

}
