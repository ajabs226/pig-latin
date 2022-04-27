

public class PigLatin {

	public static String translate(String word) {
		String translated = "";

		word = word.toLowerCase();

		char startLetter = word.toCharArray()[0];

		if (isVowel(startLetter) == true) {
			translated = word + "way"; 
			
		} else {
			int vowelIndex = -1;
			
			for (int j = 0; j <= word.length(); j++) { 
														
				if (isVowel(word.toCharArray()[j]) == true) {
					vowelIndex = j;
					break;
				}
			}

			String consStart = word.substring(vowelIndex); 
			String consTranslate = word.substring(0, vowelIndex); 

			translated = consStart + consTranslate + "ay";

		}
		return translated;
	}
	
	public static Boolean isVowel(char vowelLetters) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String startVowel = String.valueOf(vowelLetters);
		String vowel = new String(vowels);
		return vowel.contains(startVowel); 
	}
}

