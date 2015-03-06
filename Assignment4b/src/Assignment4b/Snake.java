package Assignment4b;



public class Snake extends Animal {
	
	private boolean poison;

	public Snake(String latinName, String friendlyName, boolean poison) {
		super(latinName, friendlyName);
		this.poison=poison;
		
	}
	
	public String getinfo(){
		
		String s;
		if(poison){
			s="";
		}else{
			s="nope ";
		}
		return "The snake \""+super.getLatin()+" lat: "+super.getFriendly()+" is " +s+"dangerous \n";
	}


	

}
