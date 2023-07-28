package builder;

public class SellElectronicsBuilder implements IndividualAdsBuilder{

	private IndividualAds individualAds;
	
	public SellElectronicsBuilder (Double offerPrice, String contactDetails, String adName, String description) {
		this.individualAds = new IndividualAds(offerPrice, contactDetails, adName, description);
	}
	@Override
	public void buildAdType() {
		// TODO Auto-generated method stub
		this.individualAds.setAdType("For Sale");
	}

	@Override
	public void buildProductType() {
		// TODO Auto-generated method stub
		this.individualAds.setProductType("Electronics");
	}

	@Override
	public void buildAd() {
		// TODO Auto-generated method stub
		this.individualAds.createInfo();
	}

	@Override
	public IndividualAds getIndividualAds() {
		// TODO Auto-generated method stub
		return this.individualAds;
	}

}
