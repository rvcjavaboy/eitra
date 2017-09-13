import java.util.*;
import java.util.Map.*;
/*
@Author:Ranjit Chavan
@Title:4. Write a program to print a histogram of the frequencies of different 
		  characters in its input string/paragraph.
		  i.e. Enter elements:  ababbbbbbb 
  			output:     a : 2 
            	        b : 8
@Date:12/9/2017		   


*/
public class Histogram{
	/*

		this class for reading string and generating histogram

	*/
	public static String calculate(String value){
		/*
			this method for calclating histogram in String

		*/
		Hashtable<Character,Integer> hash=new Hashtable<Character,Integer>();  //hashtable mapping key=character value is count

		char ch[]=value.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(hash.containsKey(ch[i]))  			//checking charachter avaliable or not on hashtable
				hash.put(ch[i],hash.get(ch[i])+1);  //increment value it by one
			else 
				hash.put(ch[i],1);                   //pushing the character into hashtable
 			}
		
		
		String s="";
		  for(Entry<Character, Integer> m:hash.entrySet()){   //generating result 
			   s+="\n"+m.getKey()+" :"+m.getValue();  
			  }
		return s;   //returning histogram
	}


	public static void main(String a[]){

		System.out.println(calculate("ababbbbbcbb"));  //passing input string calculate method
 	}

}