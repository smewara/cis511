class currentstate
{
	int state;
	char symbol;
	int position;
	
	public currentstate()
	{
		state=0;
		symbol=' ';
		position=0;
	}
	
	int getstate()
	{
		return state;
	}

	char getsymbol()
	{
		return symbol;
	}

	int getposition()
	{
		return position;
	}

}
