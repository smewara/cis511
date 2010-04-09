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

	public String getsymbol()
	{
		return symbol;
	}

	public int getposition()
	{
		return position;
	}
	
	public void setstate(int s)
	{
		state = s;
	}

	public void setsym(String a)
	{
		symbol = a;
	}

	public void setposition(int j)
	{
		position = j;
	}
}
