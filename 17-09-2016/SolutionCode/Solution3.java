public class Solution3 {
	int count = 0;
	String str = new String();
	/*public Solution3(String s) {
		this.str = s;
	}*/
	
	public boolean containE(String s) {
		this.str = s;
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0; i<sb.length(); i++)
		{
			if(sb.charAt(i) == 'e')
				count++;
		}
		
		if(count >= 1 && count <=3)
			return true;
		else 
			return false;
		
	}
}
