import java.lang.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class main
{
	public static void main(String args[])
	{
	
	int state=0;
	String input="";
	char sym=' ';
	int pos=0;
	int j=0;
	int k=0;
	int num=0;
		currentstate c = new currentstate(1,args[0],pos);

		System.out.println("");

		turing m = new turing(1234,"abB",1);
		m.print();	

		File file = new File("transistion_function.txt"	);

		try{
		Scanner s = new Scanner(file);
		num = s.nextInt();
		System.out.println(num);	
		transistion[] t = new transistion[num];
		while(s.hasNextLine())
		{
                t[k] = new transistion(s.nextInt(),(s.next()).charAt(0),s.nextInt(),(s.next()).charAt(0),(s.next()).charAt(0));
               	//t[1] = new transistion(1,'a',2,'R','b');
               	//t[2] = new transistion(1,'b',2,'R','a');
               	//t[3] = new transistion(2,'a',2,'R','b');
               	//t[4] = new transistion(2,'b',2,'R','a');
               	k++; 
		}
		
                for(j=0; j<num ;j++) t[j].print();
		
		int i=0;

		do
		{
		i=0;
		
		state = c.getstate();
                input = c.getsymbol();
                pos = c.getposition();
                sym = input.charAt(pos);
                System.out.println(c.getsymbol()+" " +c.getposition()+" "+c.getstate());

                	for(i=0; i<num; i++)
                	{
                        	if(state==t[i].getstate1() && sym==t[i].getinput())
                        	{
                                	c.setstate(t[i].getstate2());
                                	c.setsym(replaceCharAt(input, pos,t[i].getinput2()));
			
					if(t[i].getm()=='L')
					{
						c.setposition(pos-1);
					}
					else
					{
						c.setposition(pos+1);
					}
				}
			}
		}while(sym!='B');
		System.out.println("Accepted");
		
         	}catch(FileNotFoundException e){e.printStackTrace();}
		}
		public static String replaceCharAt(String s, int p, char c) 
		{
 			  return s.substring(0,p) + c + s.substring(p+1);
		}

}
