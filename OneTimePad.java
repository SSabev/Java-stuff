public class OneTimePad
{
	
	public static int charToInt(char l)
	{
		int char_num = (int) (l) - 97;
		
		return char_num;
	}
	
	public static char intToChar(int i)
	{
		char num_char = (char) (i + 97);
		
		return num_char;
	}
	
	public static boolean isAlpha(char c)
	{
		if ((int) c >= 97 && (int) c <= 122)
		{
			return true;
		}
		else return false;
	}
	
	public static String encipher(String original, String onetimepad )
	{
		String original_str = original.toLowerCase();
		String onetimepad_str1 = onetimepad.toLowerCase();
		String msg = "";
		
		if ( original_str.length() > onetimepad_str1.length())
		{
			onetimepad_str1 += onetimepad_str1;
		}
		
		for (int i = 0; i < original_str.length(); i++)
		{
			char orig_char = original_str.charAt(i);
			char onetimepad_str_char = onetimepad_str1.charAt(i);
			
			if (isAlpha(orig_char))
			{
				int cipher_num = (charToInt(orig_char) + charToInt(onetimepad_str_char))%26;
			
				msg += intToChar(cipher_num);
			}
			else msg += " ";
		}
		
		return msg;
		
	}
	
	public static String decipher(String encipheredText, String onetimepad )
	{
		String encipheredText_str = encipheredText.toLowerCase();
		String onetimepad_str2 = onetimepad.toLowerCase();
		String msg = "";
		
		if ( encipheredText_str.length() > onetimepad_str2.length())
		{
			onetimepad_str2 += onetimepad_str2;
		}
		
		for (int i = 0; i < encipheredText_str.length(); i++)
		{
			char orig_char = encipheredText_str.charAt(i);
			char onetimepad_str_char = onetimepad_str2.charAt(i);
			
			if (isAlpha(orig_char))
			{
				int cipher_num = charToInt(orig_char) - charToInt(onetimepad_str_char);
				
				if (cipher_num < 0)
				{
					cipher_num += 26;
				}
				
				msg += intToChar(cipher_num%26);
			}
			else msg += " ";
		}
		
		return msg.toUpperCase();
	}
	
	
	public static void main(String[] args)
	{
		String ciphertext = encipher("SUPERSECRETMESSAGE","MYSUPERDUPERSECRETCKEY");
		System.out.println(ciphertext);
	}
	
	
	
}