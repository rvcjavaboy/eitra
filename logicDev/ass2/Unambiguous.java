import java.io.*;
/*
@Author:Ranjit Chavan
@Title:3. Write a program to copy its input to its output, replacing each tab by \t, 
		 each backspace by \b, and each backslash by \\. 
         This makes tabs and backspaces visible in an unambiguous way.
@Date:12/9/2017		   


*/
public class Unambiguous{
	/*

		this class for removing backspace and tabs in file

	*/
	public static void main(String a[]){

		System.out.println(read("Unambiguous.java"));
	}


	public static String read(String filename){
		/*
			this method for read the file and removing backspace and tabs
			@param file name in string
			@return display file without tabs and space

		*/
			String s="";
		try{
			BufferedReader br=new BufferedReader(new FileReader(new File(filename)));
			int ch=(char) br.read();
			while(ch!=-1){
				if((char)ch=='\t')      //checking tabs
					s+="\\t";
				else if((char)ch=='\b') //checking  backspace
 				s+="\\b";
				
				else if((char)ch=='\\')  //checking backslash
				s+="\\";
				else
				s+=(char)ch;

				
				ch=br.read();	
			}


		}catch(Exception e){
			System.out.println("File Error");
			e.printStackTrace();
		}

		return s;		//new file data return 

	}


}