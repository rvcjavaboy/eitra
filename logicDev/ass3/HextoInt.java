/*
@Author:Ranjit Chavan
@Title:Write a function htoi(s), which converts a string of hexadecimal digits 
		(including an optional 0x or 0X) into its equivalent integer value. 
		The allowable digits are 0 through 9, a through f, and A through F.
@Date:12/9/2017		   
*/
public class HextoInt{
	/*
		This class for convert hexdecimal number to decimal number
	*/
	static char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F' };
	
	public static int Convert(String num){
		/*
			this method for convert hex to decimal number 
			@param String number in hexDecimal
			@return decimal number
		*/
		int result=0;

		for(int i=0;i<num.length();i++){
			for(int j=0;j<hexDigit.length;j++){
				if(num.toUpperCase().charAt(i)==hexDigit[j])
					result+=j*Math.pow(16,(num.length()-i)-1);
				}
		}

		return result;
	}	


	public static void main(String a[]){

		java.util.Scanner s=new java.util.Scanner(System.in);
		String hex=s.next();
		while(!validate(hex)){
			System.out.println("Invalid Hex Number !!!!!");
			hex=s.next();
		}
		System.out.println("HexDecimal Number ::"+Convert(hex));
		

	}
	public static boolean validate(String hex){
		/*
		this method for validating hexdecimal number
		@param String in hexdecimal format
		@return true if hexdecimal format is write



		*/
			boolean flag=false;
            for(int i=0;i<hex.length();i++){

            	for(int j=0;j<hexDigit.length;j++){
            		if(hex.toUpperCase().charAt(i)==hexDigit[j])
					  
						flag=true;

    	        }
    	        if(!flag){
    	        	return false;
    	        }
    		}
    		return true;
	}

}