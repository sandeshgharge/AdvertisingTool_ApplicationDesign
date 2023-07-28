package composite;

public class Jobs  extends OrganisationalAds{



	private String salary;
	private String position;
	
	public Jobs(
			String salary, 
			String position, 
			String organisationName, 
			String link, 
			String adName, 
			String description) {
		super(organisationName, link, adName, description);
		this.salary = salary;
		this.position = position;
		// TODO Auto-generated constructor stub
		
		info = "Job Opportunity : " + this.organisationName +
				" " + this.adName +
				" Role : " + this.position +
				" Estimated Salary : " + this.salary + 
				" Description : " + this.description + 
				" Website-Link : " + this.link
 				;
	}
	
	//Auto Generated Getter and Setters
	
	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}

	

}