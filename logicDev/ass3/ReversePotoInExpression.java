import java.util.Stack;
/*
@Author:Ranjit Chavan
@Title:7. Write the program expr, which evaluates a reverse Polish expression from the command line, 
		   where each operator or operand is a separate argument. For example, 
		   expr 2 3 4 + * evaluates 2*(3+4).
@Date:13/9/2017		   


*/
public class ReversePotoInExpression{
	/*
		this class for evaluting the postfix expression to infix expression


	*/
	static Stack <String> stack=new Stack<>();  // stack for storing the symbols and operator
	public static boolean isOperator(char c){
		/*	
			This method for checking the character is operator or not
			@param  character
			return true if is operator
		*/
		if(c=='*'||c=='+'||c=='/'||c=='^'||c=='%'||c=='-')
			return true;
		else
			return false;
		
	}

	public static void convert(String expression){
		/*
			this method for convert string postfix expression to infix expression
			@param String expression 



		*/
		for(int i=0;i<expression.length();i++){
			char symbol=expression.charAt(i);
			if(isOperator(symbol)){    //checking operator
				String a=stack.pop();  //poping prev element
				String c=stack.pop();	//poping prev element	
				stack.push("("+c+symbol+a+")");  //pushing new element
			}else
				stack.push(""+symbol);   //pushing new element      

		}

	}

	public static String evaluateExpression(){
		/*	
			This method for retutn the evalured string expression
			@return String infix expression

		*/
		return stack.pop();
	}

	public static void main(String a[]){
		java.util.Scanner s=new java.util.Scanner(System.in);
		String exp=s.next();
		convert(exp);

		System.out.println(evaluateExpression());
		
	}
	
}