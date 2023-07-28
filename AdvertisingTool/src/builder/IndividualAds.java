package builder;

import observer.Advertisement;

public class IndividualAds extends Advertisement implements IndividualAdsOutline{

	private String adType;
	private String prodType;
	private Double offerPrice;
	private String contactDetails;
	
	public IndividualAds(Double offerPrice, String contactDetails, String adName, String description) {
		super(adName, description);
		// TODO Auto-generated constructor stub
		
		this.offerPrice = offerPrice;
		this.contactDetails = contactDetails;
	}

	@Override
	public void setAdType(String adType) {
		// TODO Auto-generated method stub
		this.adType = adType;
	}

	@Override
	public void setProductType(String prodType) {
		// TODO Auto-generated method stub
		this.prodType = prodType;
	}

	@Override
	public void setOfferPrice(Double amount) {
		// TODO Auto-generated method stub
		this.offerPrice = amount;
	}
	
	@Override
	public void setContactDetails(String contact) {
		// TODO Auto-generated method stub
		this.contactDetails = contact;
		
	}
	
	public void createInfo() {
		info = this.prodType + " " + this.adType + " | "
				+ this.adName + " | "
				+ "Offer Price : " + this.offerPrice + " | "
				+ "Contact Details : " + this.contactDetails
				;
	}



}
