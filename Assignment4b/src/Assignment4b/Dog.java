package Assignment4b;

public class Dog extends Mammal{
	
	private boolean Stupid;

	public Dog(String latinName, String friendlyName, int nursingTime, boolean Stupid) {
		super(latinName, friendlyName, nursingTime);
		this.Stupid = Stupid;
		
	}
	public Dog(String friendlyName, int nursingTime, boolean Stupid) {
		super(friendlyName,"Stray dog", nursingTime);
		this.Stupid = Stupid;
	}
	public boolean getStupid(){
		return Stupid;
	}
	
	
	public void setStupid(boolean Stupid){
		this.Stupid = Stupid;
	}

	public String getinfo(){
		
		String s;
		if(Stupid){
			s="";
		}else{
			s="not";
		}
		return "The dog \""+super.getLatin()+" lat: "+super.getFriendly()+" nurses for "+super.getnursingTime()+" hours and has "+s+" a minor retardness. \n";
	}
	
	
}