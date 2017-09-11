/*
@Author:Ranjit Chavan
@Title:Number Pattern   5678 678 78 8
@Date :11/9/2017


*/
public class NumberPattern{

	public static void main(String ap[]){
		print(5678);						//passing value to function

	}public static  void print(int num){
		String value=String.valueOf(num);	//converting number to string
		char c[]=value.toCharArray();			//converting string to character
		for(int i=0;i<value.length();i++){
			for(int j=i;j<value.length();j++){
				System.out.print(c[j]);         //printing value
			}
			System.out.print("\t");				//printing next iteration with tab
		}

		System.out.println();
	}


}