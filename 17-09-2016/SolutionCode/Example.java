public class Example {
	public static void main(String args[]) {
		String str = "apssdc";
		
		//str[1] not possible in java
		
		str = str + " training";//valid in java but inefficient
	
		//System.out.println(str);
		
		//more efficient
		StringBuilder sb = new StringBuilder(str);
		//System.out.println(sb.toString() + " " + sb.length());
		
		sb.append(" on Android").append(" Developer Fundamentals");
		
		System.out.println(sb.toString()); //toString() method is used to get the string form of the 'sb'
	}
}
