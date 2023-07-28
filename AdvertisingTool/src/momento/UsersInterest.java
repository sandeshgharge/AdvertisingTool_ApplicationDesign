package momento;

import java.util.ArrayList;

import observer.Observer;

public class UsersInterest{
	
	private boolean login;
	private ArrayList<Observer> lstVisitedAds;
	
	public UsersInterest() {
		lstVisitedAds = new ArrayList<Observer>();
	}
	
	public void add(Observer adObject) {
		
		if(login)
			this.lstVisitedAds.add(adObject);
	}
	
	public void displayTitle() {
		for( Observer o : lstVisitedAds) {
			System.out.println(o.getAdName());
		}
	}
	
	
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	public ArrayList getLstVisitedAds() {
		return lstVisitedAds;
	}
	public void setLstVisitedAds(ArrayList lstVisitedAds) {
		this.lstVisitedAds = lstVisitedAds;
	}
	
}
