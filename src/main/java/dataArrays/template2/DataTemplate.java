package dataArrays.template2;

public class DataTemplate 
{
	private String stFirstName;
	private String stLastName;
	private String phone;
	private String email;
	
	
	public DataTemplate(String stFirstName, String stLastName, String phone, String email) 
	{
		super();
		this.stFirstName = stFirstName;
		this.stLastName = stLastName;
		this.phone = phone;
		this.email = email;
	}

	
	

	public String getStFirstName() {
		return stFirstName;
	}
	public void setStFirstName(String stFirstName) {
		this.stFirstName = stFirstName;
	}


	public String getStLastName() {
		return stLastName;
	}
	public void setStLastName(String stLastName) {
		this.stLastName = stLastName;
	}


	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


}
