package learning.codingproblems.solutions;

import java.util.ArrayList;
import java.util.List;

public class CharacterOccurrence {

	//Character Occurrence in the String "Automation" | Ouptut: {'a': 2, 'o': 2, 't': 2, 'i': 1, 'm': 1, 'u': 1, 'n': 1}

	
	public static void main(String[] args) {
		String str = "aba";
		char temp1;
		char temp2;
		List<Character> strChar = new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			temp1 = str.charAt(i);
			if(strChar.contains(temp1)) {
			continue;
			}
			strChar.add(temp1);
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				temp2 = str.charAt(j);
				if(temp1==temp2) {
					count++;
				}
			}
			System.out.println(temp1 +" : "+ count);
		}
		System.out.println(strChar);
	}

}
