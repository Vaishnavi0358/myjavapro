public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j+i<=4 || j-i>=5 || j-i<=-4 || j+i>=13)
				
					System.out.print("*");
				
				else
				
					System.out.print(" ");
				
				
			}
			System.out.println();
		}

	}

}
