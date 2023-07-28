import java.util.Scanner;

import builder.IndividualAdDesigner;
import builder.IndividualAdsBuilder;
import builder.RentCarBuilder;
import builder.RentHouseBuilder;
import builder.SellCarBuilder;
import builder.SellElectronicsBuilder;
import composite.Jobs;
import composite.Offers;
import momento.UsersInterest;
import observer.AdvertisementList;
import observer.Observer;
import observer.Subject;

public class Implementation extends Thread{
	

	static Subject adList = new AdvertisementList();
	static UsersInterest userObject = new UsersInterest();
	static int adToSave = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addOrganisationalAds();
		addIndividualAds();
		Scanner sc= new Scanner(System.in);
		String ip = "";
		int totalAds = 0;
		boolean exitFlag = true;
		
		while(exitFlag) {
			
			System.out.println("Advertisement Board : ");
			totalAds = adList.displayObserver();
			System.out.println();
			System.out.println("Select prefered option :");
			System.out.println("1. Login");
			System.out.println("2. Change Language to German");
			System.out.println("3. Change Language to English");
			System.out.println("4. Exit");
			System.out.println();
			
			ip = sc.nextLine();
						
			switch (ip) {
				
				case "1":
					
					userObject.setLogin(true);
					
					break;
				case "2":
					adList.setLanguage("German");
					break;
				case "3":
					adList.setLanguage("English");
					break;
				case "4":
					exitFlag = false;
					break;
				default:
					break;
			}
			
			while(userObject.isLogin()) {
				System.out.println("Select the advertisement to save or enter 'logout' to exit : ");
				System.out.println();
				
				System.out.println("Saved Ads :");
				userObject.displayTitle();
				
				System.out.println();
				System.out.println("All Ads : ");
				totalAds = adList.displayObserver();
				
				ip = sc.nextLine();
				
				if(ip.equals("logout"))
					userObject.setLogin(false);
				else {
					try {
						adToSave = Integer.parseInt(ip);
						if(adToSave < totalAds) {
							// here the functionality which is carried asynchronously
							Implementation implementation = new Implementation();
							implementation.start();
							//userObject.add(adList.fetchObject(adToSave+1));
						}
						else
							System.out.println("Please select right advertisement.");
					}
					catch(Exception e) {
						System.out.println("Invalid Input");
					}
				}
			}
					
		}
		sc.close();
	}
	
	
	
	
	static void addOrganisationalAds(){
		
		/*
		 * Parameters for Offers
		 * organisationType
		 * organisationName
		 * link
		 * adName
		 * description
		 */
		Observer objectOffer = new Offers (
				"Super Market",
				"REVE",
				"www.abc.com",
				"Gemuse Offers",
				"Offer upto 10%");
		adList.register(objectOffer);
		/*
		 * Parameters for Job
		 * salary
		 * position
		 * organisationName
		 * link
		 * adName
		 * description
		 */
		Observer objectJob = new Jobs (
				"12 Euro per hour",
				"Bar Tender",
				"Studio 449",
				"www.studio449.com",
				"Part Time Job Available",
				"Can work either Evening or Morning");
		
		adList.register(objectJob);

	}
	
	static void addIndividualAds() {
		
		/*
		 * Parameters sequence to be passed
		 * offerPrice
		 * contactDetails
		 * adName
		 * description
		 */
		
		IndividualAdsBuilder rentCar = new RentCarBuilder(
				200.0, 
				"sandy@gmail.com +49 133133133", 
				"BWM Available", 
				"Car is available for 2 months");
		
		IndividualAdsBuilder rentHouse = new RentHouseBuilder(
				300000.0, 
				"vipul@gmail.com +49 123123123213", 
				"2 rooms House", 
				"House is available for 2 years");
		
		IndividualAdsBuilder sellCar = new SellCarBuilder(
				45000.0, 
				"anna@gmail.com +49 345345435", 
				"Mercedes Benz", 
				"In condition and payment only in cash");
		
		IndividualAdsBuilder sellLaptop = new SellElectronicsBuilder(
				850.0, 
				"vipul@gmail.com +49 17723487382", 
				"Macbook M1", 
				"2021 Product in Condition");
		
		IndividualAdDesigner designerObject = new IndividualAdDesigner(rentCar);
		designerObject.constructAd();
		adList.register(designerObject.getIndividualAds());
		
		designerObject = new IndividualAdDesigner(rentHouse);
		designerObject.constructAd();
		adList.register(designerObject.getIndividualAds());
		
		designerObject = new IndividualAdDesigner(sellCar);
		designerObject.constructAd();
		adList.register(designerObject.getIndividualAds());
		
		designerObject = new IndividualAdDesigner(sellLaptop);
		designerObject.constructAd();
		adList.register(designerObject.getIndividualAds());
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Asynchronus Evented triggered to update");
		userObject.add(adList.fetchObject(adToSave-1));
		
		System.out.println("");
	}

}
