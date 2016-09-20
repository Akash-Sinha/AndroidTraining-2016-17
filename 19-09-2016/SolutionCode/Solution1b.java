public class Solution1b {
	public int sumDigits(String s) {
		/*
		 * Extract all numbers in the given string
			* Traverse through each character in the string and check if it is a digit
				* if so, convert the string at that position into an Integer(Integer class and parseInt method)
				* add the converted integer to sum.
				* 
				*/
				
		int sum = 0;
		String cs = new String();
		for(int i=0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
				cs = Character.toString(c);
				sum = sum + Integer.parseInt(cs);
			}
		}	//end for loop
		
		return sum; 
	}
}

// "java1" => '1' => "1"







