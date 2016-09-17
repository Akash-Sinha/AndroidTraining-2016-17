public class Solution1 {
	
	public String missingChar(String s, int n) {
		String str = new String("");
		str = s.substring(0,n); 
		str += s.substring(n+1);
		return str;	
	}
}
