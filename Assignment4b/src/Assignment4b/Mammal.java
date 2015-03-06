
package Assignment4b;
	
	public abstract class Mammal extends Animal{
		
		public int nursingTime;
		
		public Mammal(String latinName, String friendlyName, int nursingTime) {
			super(latinName, friendlyName);
			this.nursingTime = nursingTime;
		
		}

		public int getnursingTime(){
			return nursingTime;
		}
		
	}


