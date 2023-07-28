package observer;

import java.util.ArrayList;

public class AdvertisementList implements Subject {

	private String language = "English";
	private ArrayList<Observer> obs;

	public AdvertisementList () {
		
		obs = new ArrayList<Observer> ();
	}


	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		obs.add(o);
	}
	@Override
	public void unRegister(Observer o) {
		// TODO Auto-generated method stub
		int index = obs.indexOf(o);
		obs.remove(index);
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for( Observer o : obs) {
			o.update(language);
		}
	}
	
	public void setLanguage(String language) {
		this.language = language;
		notifyObserver();
	}
	
	@Override
	public void displayTitle() {
		// TODO Auto-generated method stub
		
		for( Observer o : obs) {
			System.out.println(o.getAdName());
		}
	}
	
	@Override
	public int displayObserver() {
		// TODO Auto-generated method stub
		int i=1;
		for( Observer o : obs) {
			System.out.println(i++ +". "+o.showInformation());
		}
		return i;
	}

	@Override
	public Observer fetchObject(int i) {
		// TODO Auto-generated method stub
		return this.obs.get(i);
	}

}
