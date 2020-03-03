package fr.uvsq.exercice3;

public enum Direction {
	OUEST('o'){
		
		public char dir()
		{
			return 'o';
		}
	},
	NORD('n'){
		
		public char dir()
		{
			return 'n';
		}
	},
	EST('e'){
		
		public char dir()
		{
			return 'e';
		}
	},
	SUD('s'){
		
		public char dir()
		{
			return 's';
		}
	};
	
   private char symbole;
	
	Direction(char symbole)
	{
		this.symbole = symbole;
	}
	
	public abstract char dir();
	public char getdirection(){
		return symbole;
	}
	
	

}
