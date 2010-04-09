import java.lang.*;

class main
{
	public static void main(String args[])
	{
	
	int state=0;
	String input="";
	char sym=' ';
	int pos=0;
	int j=0;
	
		currentstate c = new currentstate(1,args[0],pos);

		System.out.println("");

		turing m = new turing(1234,"abB",1);
		m.print();	
		
		transistion[] t = new transistion[9];
                t[0] = new transistion(1,'B',4,'R','B');
                t[1] = new transistion(1,'a',2,'R','b');
                t[2] = new transistion(1,'b',2,'R','a');
                t[3] = new transistion(2,'a',2,'R','b');
                t[4] = new transistion(2,'b',2,'R','a');
                t[5] = new transistion(2,'B',3,'L','B');
                t[6] = new transistion(3,'a',3,'L','a');
                t[7] = new transistion(3,'b',3,'L','b');
                t[8] = new transistion(3,'B',4,'R','B');

                for(j=0; j<9 ;j++) t[j].print();
		
		int i=0;

		do
		{
		i=0;
		
		state = c.getstate();
                input = c.getsymbol();
                pos = c.getposition();
                sym = input.charAt(pos);
                System.out.println(c.getsymbol()+" " +c.getposition()+" "+c.getstate());

                	for(i=0; i<9; i++)
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
		}	

		public static String replaceCharAt(String s, int p, char c) 
		{
 			  return s.substring(0,p) + c + s.substring(p+1);
		}

}
