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

	public static void main(String args[])
	{
		transistion t = new transistion(2,'a',3,'L','b');
		t.print();
	}
}
	
	
	 
