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
	int pos=1;
	int j=0;
	int k=0;
	int num=0;
	int flag;
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
		while(s.hasNextInt())
		{
		int var1 = s.nextInt();
		char var2 = (s.next()).charAt(0);
		int var3 = s.nextInt();
		char var4 = (s.next()).charAt(0);
		char var5 = (s.next()).charAt(0);
                t[k] = new transistion(var1,var2,var3,var4,var5);
               	
               	k++; 
		}
		
                for(j=0; j<num ;j++) t[j].print();
		
		int i=0;

		do
		{
		i=0;
		
		state = c.getstate();
                sym = c.getsymbol();
              
                c.print();
		flag=0;
                	for(i=0; i<num; i++)
                	{
                        	if(state==t[i].getstate1() && sym==t[i].getinput())
                        	{
					flag = 1;
                                	c.setstate(t[i].getstate2());
                                	c.setsym(t[i].getinput2());
			
					c.moveLorR(t[i].getm());
				}
			}

			
		}while(flag!=0);
		
         	}catch(FileNotFoundException e){e.printStackTrace();}
		
		}
		public static String replaceCharAt(String s, int p, char c) 
		{
 			  return s.substring(0,p) + c + s.substring(p+1);
		}

}
