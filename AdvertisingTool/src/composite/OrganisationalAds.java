package composite;

import observer.Advertisement;

public abstract class OrganisationalAds extends Advertisement {
	
	protected String organisationName;
	protected String link;
	
	public OrganisationalAds(
			String organisationName, 
			String link, 
			String adName, 
			String description) {
		super(adName, description);
		
		this.organisationName = organisationName;
		this.link = link;
	}	
}
