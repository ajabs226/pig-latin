import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void testPigLatinAVowel() {
		String pigLatin = "apple";
		String expected = "appleway";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);
	}
	
	@Test
	void testPigLatinEVowel() {
		String pigLatin = "elephant";
		String expected = "elephantway";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);
	}
	
	@Test
	void testPigLatinIVowel() {
		String pigLatin = "Igloo";
		String expected = "iglooway";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);
	}
	
	@Test
	void testPigLatinOVowel() {
		String pigLatin = "ORANGE";
		String expected = "orangeway";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);
	}
	
	@Test
	void testPigLatinUVowel() {
		String pigLatin = "umbrElla";
		String expected = "umbrellaway";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);
	}

	@Test
	void testPigLatinOneConsonant() {
		String pigLatin = "giraffE";
		String expected = "iraffegay";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);

	}
	
	@Test
	void testPigLatinOneConsonant2() {
		String pigLatin = "happy";
		String expected = "appyhay";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);

	}

	@Test
	void testPigLatinTwoConsonants() {
		String pigLatin = "chARGe";
		String expected = "argechay";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);

	}
	
	@Test
	void testPigLatinThreeConsonants() {
		String pigLatin = "sChOOl";
		String expected = "oolschay";
		String actual = PigLatin.translate(pigLatin);
		assertEquals(expected, actual);

	}
}
