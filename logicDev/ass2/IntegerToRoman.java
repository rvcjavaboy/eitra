/*



@Author:Ranjit Chavan
@Title:Intger To roman Number Converter
@Date :11/9/2017



	Title:Intger To roman Number Converter




      M    1000            X   10
      CM    900            IX   9
      D     500            V    5
      CD    400            IV   4
      C     100            I    1
      XC     90
      L      50
      XL     40

	


*/



public class IntegerToRoman{
	public static void main(String a[]){
		System.out.println("Enter The Number");
		System.out.println(run(new java.util.Scanner(System.in).nextInt()));  //Getting input

	}public static String run(int num){					//    function for calculating roman number
		String roman="";
		while(num!=0){
			 while (num >= 1000) {			// for 1000 upper value
	            roman += "M";				//adding romman value
	            num -= 1000;				//substrating 1000 for current value
	         }	
	         while (num >= 900) {
	            roman += "CM";
	            num -= 900;
	         }
	         while(num>=500){
	         	roman+="D";
	         	num-=500;
	         }
	         while(num>=400){
	         roman+="CD";
	         num-=400;
	         
	         }
	         while(num>=100){
	         roman+="C";
	         num-=100;
	         }
	         while(num>=90){
	         	roman+="XC";
	         	num-=90;
	         }  
	     	 while(num>=50){
	      		roman+="L";
	      		num-=50;
	      	}while(num>=40){
	      		roman+="XL";
	      		num-=40;
	      	}while(num>=10){
	      		roman+="X";
	      		num-=10;
	      	}while(num>=9){
	      		roman+="IX";
	      		num-=9;
	      		
	      	}
	      	while(num>=9){
	      		roman+="V";
	      		num-=9;
	      		
	      	}while(num>=4){
	      		roman+="IV";
	      		num-=4;
	      		
	      	}while(num>=1){
	      		roman+="I";
	      		num-=1;
	      		
	      	}


		}
		return roman;					//return roman value
	}

}
