package learning.codingproblems.solutions;

public class CharacterDoubling {
	
	//Input = "abcd"   Output = "aabbccdd"
	
	public static void main(String[]args) {
		String str1 = "abcd";
		String str2 = "";
		char temp;
		for(int i=0;i<str1.length();i++) {
			temp = str1.charAt(i);
			str2 = str2+temp;
			str2 = str2+temp;
		}
		System.out.println("Ouput : "+str2);
	}
}
