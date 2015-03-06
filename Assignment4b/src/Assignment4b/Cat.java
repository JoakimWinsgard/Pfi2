package Assignment4b;

public class Cat extends Mammal {

	private int lives;
	
	public Cat(String latinName, String friendlyName, int nursingTime) {
		super(latinName, friendlyName, nursingTime);
		this.lives = lives;
		
	}
	public Cat(String latinName, int nursingTime, int lives){
		super(latinName,"noname", nursingTime);
		this.lives=lives;
	}
	
	public int getLives(){
		return lives;
	}
	@Override
	public String getinfo(){
		String s;
		s = "The cat \""+super.getLatin()+" lat: "+super.getFriendly()+"\" nurses for "+super.getnursingTime()+" hours and has "+ lives + " lives. \n";
		return s;
	}
	

}
