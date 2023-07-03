package numbers.anagram;

import java.util.Arrays;

public class AnagramString_2 {

	public static void main(String[] args) {
		//isAnagram("Mother In Law", "Hitler Woman");
		//isAnagram("keEp", "peeK");
//		isAnagram("SiLeNt CAT", "LisTen AcT");
//		isAnagram("Debit Card", "Bad Credit");
//		isAnagram("School MASTER", "The ClassROOM");
//		isAnagram("DORMITORY", "Dirty Room");
//		isAnagram("ASTRONOMERS", "NO MORE STARS");
//		isAnagram("Toss", "Shot");
//		isAnagram("joy", "enjoy");
		String s1="Keep";
		String s2="peek";
//	}

//	static void isAnagram(String s1, String s2){


		//Removing all white spaces from s1 and s2
		String str1 = s1.replaceAll(" ", "");
		String str2 = s2.replaceAll("\\s", "");

		
		boolean status = true;
		if(str1.length() != str2.length()){
			
			status = false;
		}else{
		
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			status = Arrays.equals(ch1, ch2);
		}

		//Output

		if(status){
			System.out.println(s1+" and "+s2+" are anagrams");
		}else{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
}
