package Assignment4b;

public abstract class Animal {

	private String latinName;
	private String friendlyName;
	
	//Deklarerar latiName
	public void setlatinName(String latinName){
		this.latinName=latinName;
	}
	public void setfriendlyName(String friendlyName){
		this.friendlyName=friendlyName;
	}
	
	//Skapa metoder för getter och setter latinName
	public Animal(String latinName, String friendlyName){
		setlatinName(latinName);
		setfriendlyName(friendlyName);
	}
	public String getLatin(){
		return latinName;
	}
	public String getFriendly(){
		return friendlyName;
	}
	

	
	
		
	
	
	abstract String getinfo();
	
}
