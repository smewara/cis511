class currentstate
{
	int state;
	String symbol;
	int position;
	
	public currentstate(int s, String sym, int pos)
	{
		state=s;
		symbol=sym;
		position=pos;
	}
	
	public int getstate()
	{
		return state;
	}

	public char getsymbol()
	{
		return symbol.charAt(position);
	}

	public void moveLorR(char lor)
	{
		if (lor=='L')
                {
                        position--;
                }
                else {
	                position++;
                }

		if(symbol.length() < position+1)
		{
			symbol=symbol+'B';
		}

		if(position<0)
		{
			position=0;
			symbol = 'B' + symbol;
		}

	}

	public void setstate(int s)
	{
		state = s;
	}
	
	public void setsym(char a)
	{
		String s1="";
		s1 = symbol.substring(0,position) + a + symbol.substring(position+1);
		symbol = s1;
	}

	public void print()
	{
		System.out.println(symbol + "  state :" +state + "  position :" +position);
	}
}
