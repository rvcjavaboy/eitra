import java.io.*;
/*
@Author:Ranjit Chavan
@Title:2 Write a program to count blanks, tabs, and newlines in Paragraph. 
@Date:12/9/2017		   


*/
public class Paragraph{
	/*
		this class for checking blank space tabs and newline in file
	*/	
	public static void main(String a[]){

		System.out.println(read("file.txt"));
	
	}


	public static String read(String filename){
		/*
				this method for read the file and calculate blank space and tabs,new line 
				@param file name
				@return String blankspace ,tabs,newline  count

		*/
			int blanks=0,tabs=0,newline=0;
		try{

			BufferedReader br=new BufferedReader(new FileReader(new File(filename)));  //reading file
			int ch=(char) br.read();
			while(ch!=-1){
				if((char)ch==' ')			//checking space
					blanks++;
				else if((char)ch=='\t')    //checking tabs
					tabs++;
				else if((char)ch=='\n')  //checking new line
					newline++;

				
				ch=br.read();	
			}


		}catch(Exception e){
			System.out.println("File Error");
			e.printStackTrace();
		}

		return "\n Blanks ::"+blanks+"\n Tabs ::"+tabs+"\nNew line ::"+newline;		//return count

	}


}