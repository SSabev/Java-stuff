public class Pathname
{
	
	/* Returns 4 components:
	 * [0] - directory
	 * [1] - filename
	 * [2] - filename-base (excluding the dot)
	 * [3] - filename-ext (including the dot)
	 */
	
    public static String[] splitPath(String s)
    {
		String a = s;
		String[] final_string = new String[4];
		int last_occur = 0;
		
		for (int i = a.length()-1; i >= 0; i--)
		{
			 if(a.charAt(i) == '/')
			 {
				 last_occur = i;
				 break;
			 }
		}
		
		if(a.contains("."))
		{
			final_string[0] = a.substring(0,last_occur+1);
			final_string[1] = a.substring(last_occur+1);
			final_string[2] = a.substring(last_occur+1, a.length()-4);
			final_string[3] = a.substring(a.length()-4,a.length());
		}
		else 
		{
			final_string[0] = a.substring(0,last_occur+1);
			final_string[1] = a.substring(last_occur+1);
			final_string[2] = a.substring(last_occur+1);
			final_string[3] = "";
		}

		return final_string;
	}
	
	public static String ensureAbsolute(String path)
	{
		String curDir = System.getProperty("user.dir");
		String long_name = curDir + "/" + path;
		
		if(path.charAt(0) == '/')
			return path;
		else return long_name;
	}
	
    public static void main(String args[])
    {
		String[] final_string_main = new String[4];
		
        for (String s: args) 
		{
			String a = ensureAbsolute(s);
			final_string_main = splitPath(a);
			
			if(s.contains("."))
			{
				System.out.println("File: " + final_string_main[1] + " Type: " + final_string_main[3] + " [" + final_string_main[0] + "]");
			}
			else System.out.println("File: " + final_string_main[1] + " [" + final_string_main[0] + "]");

			
        }
		
    }
}