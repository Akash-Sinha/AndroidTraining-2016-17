public class Solution2 {
	public String backAround(String s) {
		/*
		 * Extract the last character of the string
			i) calculate the length of the string.
			ii) The last index of the string can be calculated by length-1
			iii) Use the charAt method to extract the last character of the string
			 	
		 * Append it to the beginning as well as the end of the string
			i) Use methods in the StringBuilder class to accomplish this.
		
		 * return the new string as output
		 * 
		 */
		 
		 int len;
		 len = s.length();
		 char lc = s.charAt(len-1);
		 StringBuilder sb = new StringBuilder("");
		 sb.append(lc);
		 sb.append(s);
		 sb.append(lc);
		 
		 return sb.toString();
		 
	}
}
