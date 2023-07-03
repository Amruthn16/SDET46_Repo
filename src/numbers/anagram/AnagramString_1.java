package numbers.anagram;

public class AnagramString_1 {

	public static void main(String[] args) {

		String word = "race";
		String anagram = "arce";

		int count=0;

		for (int i = 0; i < word.length(); i++) {
			if (word.length() != anagram.length()) {
				System.out.println("race and arce are not anagrams");
				break;
			}else {
				char c = word.charAt(i);
				int index = anagram.indexOf(c);

				if (index != -1) {
					count++;
				} 
			}
			if(count==word.length()) {
				System.out.println("race and arce are anagrams");
			}else {
				System.out.println("race and arce are not anagrams");
			}
		}
		    
//		        Map<Character,Integer> s1 = new HashMap<>();
//		        Map<Character,Integer> t1 = new HashMap<>();
//		        if (s.length() != t.length()) return false;
//		        for(int i = 0;i<s.length();++i){
//		            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
//		            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
//		        }
//		        return s1.equals(t1);
//		    }
//		}
	}
}

