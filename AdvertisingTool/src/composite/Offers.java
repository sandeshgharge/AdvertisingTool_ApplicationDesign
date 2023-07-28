package composite;

public class Offers extends OrganisationalAds{

	
	private String organisationType;
	
	public Offers(
			String organisationType, 
			String organisationName, 
			String link, 
			String adName, 
			String description) {
		// TODO Auto-generated method stub
		super(organisationName, link, adName, description);
		this.organisationType = organisationType;
		

		info = this.organisationName + " (" + this.organisationType + ") |" +
				" : |" + this.adName +
				"| Description : " + this.description +
				"| Website-Link : " + this.link;
	}

	// Getter Setter
	public String getOrganisationType() {
		return organisationType;
	}
	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}

}
