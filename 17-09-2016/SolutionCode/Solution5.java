public class Solution5 {
	public String makeTags(String s1, String s2) {
		String output = new String("");
		
		output += buildOpenTag(s1);
		
		output += s2;
		
		output += buildCloseTag(s1);
		
		return output;
		
	}
	
	public String buildOpenTag(String s) {
		String str = new String("");
		str = "<" + s + ">";
		return str;
	}
	
	public String buildCloseTag(String s) {
		String str = new String("");
		str = "</" + s + ">";
		return str;
	}
}
