public class Solution1b {
	
	public String missingChar(String s, int n) {
		StringBuilder sb = new StringBuilder(s);
		sb.replace( n, n+1, "");
		return sb.toString();	
	}
}
