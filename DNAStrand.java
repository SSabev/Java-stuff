public class DNAStrand
{
	private String DNA;

	public DNAStrand(String dna)
	{
		DNA = dna;
	}
	
	public boolean isValidDNA()
	{
		for (int i = 0; i < DNA.length(); i++)
		{
			if (DNA.charAt(i) != 'A' && DNA.charAt(i) != 'T' && DNA.charAt(i) != 'C' && DNA.charAt(i) != 'G')
			{
				return false;
			}
		}
		
		return true;
	}
	
	public String complementWC()
	{
		String complementWC = "";
		
		for (int i = 0; i < DNA.length(); i++) 
		{
			if (DNA.charAt(i) == 'A')
			{
				complementWC +=  "T";
			}
			else if (DNA.charAt(i) == 'C')
			{
				complementWC +=  "G";
			}
			else if (DNA.charAt(i) == 'G')
			{
				complementWC +=  "C";
			}
			else 
			{
				complementWC +=  "A";
			}

		}
		
		return complementWC;
	}
	
	public String palindromeWC()
	{
		DNA = new StringBuffer(complementWC()).reverse().toString();
		
		return DNA;
	}
	
	public boolean containsSequence(String seq)
	{
		if (DNA.contains(seq)) return true;
		else return false;
	}
}