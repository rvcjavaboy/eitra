import java.util.ArrayList;


import com.rvc.playerinfo.Player;
import com.rvc.question.QuesationMC;
import com.rvc.question.Question;
import com.rvc.question.QuestionSA;
import com.rvc.question.QuestionTF;

/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 12, 2017
 * @File Name StartExam.java
 */
public class StartExam {
	java.util.Scanner scan=new java.util.Scanner(System.in);
	int point=0;
	public int startExamExecution(ArrayList<Question> filedata,Player p,int random[]){
		char ch='A';
		String ans=null;
		for(int i=0;i<random.length;i++){
			
			Question question=filedata.get(random[i]);
			
			switch(question.getQuestionType()){
				
			case "SA":
				
			QuestionSA sa=(QuestionSA)question;	
			System.out.println("Points:"+sa.getQuestionPoint());
			System.out.println("Question: "+sa.getQuestionName());
			 ans=scan.next();
			if(ans.equals(sa.getAnswerSA())){
				
				
			point=point+sa.getQuestionPoint();
				
			}else if(!ans.equalsIgnoreCase("skip")){

				System.out.println("Incorrect, the answer was "+sa.getAnswerSA()+". You lose "+sa.getQuestionPoint()+" points.");
				point=point-sa.getQuestionPoint();
					
			}
			
			
			
				
			break;
			case "TF":
				
				QuestionTF tf=(QuestionTF)question;	
				System.out.println("Points:"+tf.getQuestionPoint());
				System.out.println("Question: "+tf.getQuestionName());
				ans=scan.next();
				if(Boolean.parseBoolean(ans)==tf.isAnswer()){
					
					
				point=point+tf.getQuestionPoint();
					
				}else if(!ans.equalsIgnoreCase("skip")){
					System.out.println("Incorrect, the answer was "+tf.isAnswer()+". You lose "+tf.getQuestionPoint()+" points.");
					point=point-tf.getQuestionPoint();
						
				}
				
				
				break;
				
				
			case "MC":
				QuesationMC mc=(QuesationMC)question;	
				System.out.println("Points:"+mc.getQuestionPoint());
				System.out.println("Question: "+mc.getQuestionName());
				String ch1[]=mc.getChoice();	
				for(int j=0;j<ch1.length;j++){
					
					System.out.println(ch+")  " +ch1[j]);
					
				    ch++;
				}
				ch='A';
				
				ans=scan.next();
					
				

				if(ans.equals(mc.getAnswerMC())){
					
					point=point+mc.getQuestionPoint();
				}else if(!ans.equalsIgnoreCase("skip")){

					System.out.println("Incorrect, the answer was "+mc.getAnswerMC()+". You lose "+mc.getQuestionPoint()+" points.");
					point=point-mc.getQuestionPoint();
						
				}
				
				
				
				break;
				
				
				default:
					
				System.out.println("Not Data Found  !!!!!!!!!");	
				break;
				
			}
			
			
			
		}
		
		
	
		System.out.println(p.getFname()+"  "+p.getLname()+", your game is over!");
		System.out.println("You final score is "+point+" points.");
		System.out.println("Better luck next time!");
		
		
		
		
		
		
		return point;
	}
	
}
