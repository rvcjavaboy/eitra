import java.io.IOException;
import java.util.ArrayList;

import com.rvc.playerinfo.Player;
import com.rvc.playerinfo.PlayerInfo;
import com.rvc.question.Question;
import com.rvc.quiz.FileLoader;
import com.rvc.quiz.FileParse;

/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name QuizBow.java
 */
public class QuizBow {
	public static Player p=new Player();
	int random[],index=0;
	ArrayList<Question> filedata;
	
	
	public boolean QuizPrepare(){	
		PlayerInfo pinfo=new PlayerInfo();
		p=pinfo.getInfo(p);
		this.RandomNumberQuestion();
		FileParse file=new FileParse();
		try {
		filedata=file.FileParser(p);
		StartExam exam=new StartExam();
		exam.startExamExecution(filedata, p, random);
		} catch (IOException e) {
			System.out.println("Parsing error");
			e.printStackTrace();
		}
		
		
		
	return false;
		
	}
	
	
	
	
	/*
	 * 
	 * Random number Question Generator
	 * 
	 * 
	 */
	
	public  void RandomNumberQuestion(){
		random=new int[p.getNoOfQuestionWants()];
		ArrayList list=new ArrayList(p.getNoOfQuestionFile());
		for(int i=0;i<p.getNoOfQuestionFile();i++){
			
			list.add(i);
		}
		
		for(int k=0;k<p.getNoOfQuestionWants();k++){
		     int i = (int) Math.floor(Math.random() * list.size());
		     
		    // System.out.println("rr"+list.get(i)); //do something with question
		     
		     random[index]=(int) list.get(i);
		     list.remove(list.get(i));
		     index++;
		}
		System.gc();
	
	}
	
	public static void main(String a[]){
		
		new QuizBow().QuizPrepare();
	}
	
	
}
