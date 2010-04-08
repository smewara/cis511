class transistion
{
	int state1;
	char input;
	int state2;
	char LorR;
	char newinput;
	
	public transistion(int s1, char a, int s2, char m, char b)
	{
		this.state1 = s1;
		this.input = a;
		this.state2 = s2;
		this.LorR = m;
		this.newinput = b;
	}

	public void print()
	{
		System.out.println("(" + state1+" " +input+"->"+state2+" "+LorR+" "+newinput+")");
	} 

}
