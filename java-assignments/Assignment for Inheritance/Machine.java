

/**
 * @author Ranjit Chavan
 * @Date Jul 10, 2017
 * @File Name Tools.java
 */
 class Tool {
	
	protected int strength;
	protected String type;
	/**
	 * @param strength the strength to set
	 */
	protected void setStrength(int strength) {
		this.strength = strength;
	}
	
	
}

class Rock extends Tool{
	Rock (){
		
	} 
	Rock(int strength){
		 

			super.strength=strength;
	 }
	 boolean flight(Tool t){
		 
		 	if((this.strength*2) >t.strength){
		 		return true;
		 	}
			return false;
		}
	
}class Paper extends Tool{
	Paper(){
		
	}
	Paper(int strength){
		super.strength=strength;
		
	}
	
	
	boolean flight(Tool t){
		if(this.strength>t.strength){
			return true;
		}
		return false;
	}
	
} class Scissors extends Tool{
	Scissors(){}
	Scissors(int strength){

		super.strength=strength;
	}
	boolean flight(Tool t){
		if(this.strength>t.strength){
			return true;
		}
		return false;
	}
}


public class Machine{
		public static void main(String arr[]){
			Rock r=new Rock();
			Paper p=new Paper();
			Scissors  s=new Scissors();
			r.setStrength(10);
			p.setStrength(30);
			s.setStrength(10);
			System.out.println("Rock Strength is Double than Paper  "+r.flight(p));
			System.out.println("Rock Strength is greather than Scissors  "+r.flight(s));
			System.out.println("Paper Strength is greather than Scissors  "+p.flight(s));
			
		}	
			
}