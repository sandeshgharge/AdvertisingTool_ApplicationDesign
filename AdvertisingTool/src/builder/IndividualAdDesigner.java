package builder;

public class IndividualAdDesigner {

	private IndividualAdsBuilder individualAdsBuilder;
	
	public IndividualAdDesigner(IndividualAdsBuilder individualAdsBuilder) {
		this.individualAdsBuilder = individualAdsBuilder;
	}
	
	public IndividualAds getIndividualAds() {
		return this.individualAdsBuilder.getIndividualAds();
	}
	
	public void constructAd() {
		this.individualAdsBuilder.buildAdType();
		this.individualAdsBuilder.buildProductType();
		this.individualAdsBuilder.buildAd();
	}
}
