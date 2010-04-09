class currentstate
{
	int state;
	char symbol;
	int position;
	
	public currentstate(int s, char sym, int pos)
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

	public void setsym(char a)
	{
		symbol = a;
	}

	public void setposition(int j)
	{
		position = j;
	}
}
