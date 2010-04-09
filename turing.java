import java.lang.*;

class turing
{
	int states;
	String input;
	int q0;

	public turing()
	{                  
		input="";
		states=0;
		q0=0;
	}
	
	public turing(int s, String input, int startstate)
	{
		this.states = s;
		this.input = input;
		this.q0 = startstate;
	}

	public void print()
	{
		System.out.println("The Turing Machine is : (" +states+","+input+","+q0+")");
	} 
}
	
	
	 
