/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 7, 2017
 * @File Name Note.java
 */
public class Note {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			java.util.Scanner s=new java.util.Scanner(System.in);
			int money=s.nextInt();
			int fivehu=0,hu=0,fifty=0,tweenty=0,five=0,ten=0,one=1;;
			while(money>0){
				
					if(money/500>0){
						fivehu=money/500;
						System.out.println("m"+fivehu);
						money-=500;
						
					}if(money/100>0){
						hu=money/100;
						
						money-=100;
						
					}if(money/50>0){
						fifty=money/50;
						
						money-=50;
						
					}if(money/20>0){
						tweenty=money/20;
						money-=20;
						
						
					}if(money/10>0){
						ten=money/10;
						money-=10;
						
					}if(money/5>0){
						five=money/5;
						
						money=-5;
						
					}if(money/1>0){
						one=money/1;
						
						money-=1;
						
					}
				
				System.out.println("500 -"+fivehu+" \n 100 - "+hu+" \n 50- "+fifty+" \n 20- "+tweenty+" \n 10- "+ten+" \n 5- "+five+" \n one-"+one);
				
				
			}
			
			
			
			
	}

}
