import com.mbts.bus.DedicatedBus;
import com.mbts.bus.MixedBus;
import com.mbts.bus.SharedBus;
import com.mbts.commuter.DeadicatedCommuterRail;
import com.mbts.urban.DedicatedUrbanRail;
import com.mbts.urban.MixedUrbanRail;
import com.mbts.urban.SharedUrbanRail;

/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name RouteTest.java
 */
public class RouteTest {
	/**
	 * @param args
	 */
	private static java.util.Scanner scan1=new java.util.Scanner(System.in);
	public static void showRouteType(){
		System.out.println("1 Bus");
		System.out.println("2 Urban");
		System.out.println("3 Commuter");
		System.out.println("4 Exit");
		
		
	}
	public static void main(String[] args) {
	
		int ch=0;
		
		do{
			showRouteType();
			ch=scan1.nextInt();
			if(ch==4)System.exit(0);
			switch(ch){
			
				case 1:
					
					showcreateObject(ch);
				
					break;	
			
				case 2:
					showcreateObject(ch);
					
				break;
				
				case 3:
					showcreateObject(ch);
					
				break;
				
				default:
					System.out.println("Wrong Choice");
				break;
			}
		
		}while(ch!=4);
		
		//scan.close();
		
		
}
	
	
	
	public static void showcreateObject(int ch){
		
		if(ch==1){
			int choice=0;
			do{
				showRowType();
				choice=scan1.nextInt();
				switch(choice){
					
					case 1:
						SharedBus s=new SharedBus();
						s.getData();
						s.showData();
					return ;
					case 2:
						DedicatedBus db=new DedicatedBus();
						db.getData();
						db.showData();
					return ;
						case 3:
						MixedBus mb=new MixedBus();
						mb.getData();
						mb.showData();
					return ;
							
				
				}
				
			}while(choice!=4);
			
			
		}else if(ch==2){
			int choice=0;
			do{
				showRowType();
				choice=scan1.nextInt();
				switch(choice){
					
					case 1:
						SharedUrbanRail sb=new SharedUrbanRail();
						sb.getData();
						sb.showData();
						
					return ;
					case 2:
						DedicatedUrbanRail dub=new DedicatedUrbanRail();
						dub.getData();
						dub.showData();
						
					return ;
					case 3:
						MixedUrbanRail m=new MixedUrbanRail();
						m.getData();
						m.showData();
						
					return ;
								
				
				}
				
			}while(choice!=4);
			
		}else if(ch==3){
			DeadicatedCommuterRail dc=new DeadicatedCommuterRail();
			dc.getData();
			dc.showData();
			
		}
		
		
		
		//scan.close();
		
	}
	
	public static void showRowType(){
		System.out.println("1 Shared");
		System.out.println("2 Dedicated");
		System.out.println("3 Hybrid");
		
			
	}

}
