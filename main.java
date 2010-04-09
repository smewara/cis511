import java.lang.*;

class main
{
	public static void main(String args[])
	{
	
	int firststate=0;
	char firstsym=' ';
	int i=0;
		currentstate[] c = new currentstate[args.length + 1];
		for(i=0; i<args.length; i++)
		{
			c[i] = new currentstate(1,args[i].charAt(0),i+1);
		}
		c[i] = new currentstate(1,'B',i+1);

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

                for(i=0; i<9 ;i++) t[i].print();
		
		firststate = c[0].getstate();
                firstsym = c[0].getsymbol();

		int j=0;

		while(firstsym!='B')
		{
                	for(i=0; i<9; i++)
                	{
                        	if(firststate==t[i].getstate1() && firstsym==t[i].getinput())
                        	{
                                	c[t[i].getstate2()].setstate(t[i].getstate2());
                                	c[t[i].getstate2()].setsym(t[i].getinput2());
				}
			}
				if(t[i].getm()=='L')
				{
					j=j-1;
					c[t[i].getstate2()].setposition(j);
					firststate = c[j].getstate();
					firstsym = c[j].getsymbol();
				}
				else
				{
					j=j+1;
					c[t[i].getstate2()].setposition(j);
					firststate = c[j].getstate();
					firstsym = c[j].getsymbol();
				}
		}
	}
}
