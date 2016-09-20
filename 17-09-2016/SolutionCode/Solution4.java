public class Solution4 {
	public String embedWord(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		
		sb.insert(s1.length()/2, s2);
		
		return sb.toString();
	}
}
