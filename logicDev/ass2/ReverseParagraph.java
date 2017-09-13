import java.io.*;
public class ReverseParagraph{
	public static void main(String a[]){

		System.out.println(read("file.txt"));
	}
	public static String read(String filename){
		String out="",temp;
		try{

			BufferedReader br=new BufferedReader(new FileReader(new File(filename)));
			temp=br.readLine();
			while(temp!=null){

			out+="\n"+reverse(temp);
			temp=br.readLine();
			
			}


		}catch(Exception e){
			System.out.println("File Error");
			e.printStackTrace();
		}

		return out;
	}
	 
	 public static String reverse(String para){
        if(para == null || para.isEmpty()){
            return para;
        }      
        String reverse = "";
      /*  for(int i = para.length() -1; i>=0; i--){
            reverse = reverse + para.charAt(i);
        }
     */
        String spl[]=para.split(" ");
        for(int i=spl.length-1;i>=0;i--){
        	reverse+=" "+spl[i];
        }
        return reverse;
    }



}

