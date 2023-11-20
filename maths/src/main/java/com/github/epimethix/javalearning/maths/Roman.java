/*
 *  This is free and unencumbered software released into the public domain.
 *
 *  Anyone is free to copy, modify, publish, use, compile, 
 *  sell, or distribute this software, either in source code form or as a 
 *  compiled binary, for any purpose, commercial or non-commercial, and by any means.
 *
 *  In jurisdictions that recognize copyright laws, the author or authors of this 
 *  software dedicate any and all copyright interest in the software to the public 
 *  domain. We make this dedication for the benefit of the public at large and to 
 *  the detriment of our heirs and successors. We intend this dedication to be an 
 *  overt act of relinquishment in perpetuity of all present and future rights to 
 *  this software under copyright law.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 *  INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 *  PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS BE LIABLE 
 *  FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT 
 *  OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE 
 *  OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *  For more information, please refer to <http://unlicense.org/>
 */
package com.github.epimethix.javalearning.maths;

public final class Roman {

	/**
	 * Converts decimal ( / int) to a roman numeral for numbers 1 (one) through
	 * 3,999 (Three-thousand-nine-hundred-ninety-nine).
	 * 
	 * @param dec the decimal value between 1 and 3,999
	 * 
	 * @return the Roman numeral representation of the specified decimal value;
	 * 
	 * @throws IllegalArgumentException if the specified decimal value is less than
	 *                                  one or greater than 3,999
	 */
	public static final String decToRom(int dec) {
		if (dec > 0 && dec < 3_999) {
			int thousands = dec / 1000;
			dec = dec % 1000;
			int hundrets = dec / 100;
			dec = dec % 100;
			int tens = dec / 10;
			int ones = dec % 10;
			StringBuilder result = new StringBuilder();
			appendThousands(thousands, result);
			appendHundrets(hundrets, result);
			appendTens(tens, result);
			appendOnes(ones, result);
			return result.toString();
		} else {
			throw new IllegalArgumentException(
					String.format("decimal out of range: %d is either less than 1 or greater than 3999!", dec));
		}
	}

	private static void appendThousands(int thousands, StringBuilder result) {
		if (thousands > 0) {
			switch (thousands) {
			case 1:
				result.append("M");
				break;
			case 2:
				result.append("MM");
				break;
			case 3:
				result.append("MMM");
				break;
			default:
				throw new IllegalArgumentException("roman numeral > 3999!");
			}
		}
	}

	private static void appendHundrets(int hundrets, StringBuilder result) {
		if (hundrets > 0) {
			switch (hundrets) {
			case 1:
				result.append("C");
				break;
			case 2:
				result.append("CC");
				break;
			case 3:
				result.append("CCC");
				break;
			case 4:
				result.append("CD");
				break;
			case 5:
				result.append("D");
				break;
			case 6:
				result.append("DC");
				break;
			case 7:
				result.append("DCC");
				break;
			case 8:
				result.append("DCCC");
				break;
			case 9:
				result.append("CM");
				break;
			}
		}
	}

	private static void appendTens(int tens, StringBuilder result) {
		if (tens > 0) {
			switch (tens) {
			case 1:
				result.append("X");
				break;
			case 2:
				result.append("XX");
				break;
			case 3:
				result.append("XXX");
				break;
			case 4:
				result.append("XL");
				break;
			case 5:
				result.append("L");
				break;
			case 6:
				result.append("LX");
				break;
			case 7:
				result.append("LXX");
				break;
			case 8:
				result.append("LXXX");
				break;
			case 9:
				result.append("XC");
				break;
			}
		}
	}

	private static void appendOnes(int ones, StringBuilder result) {
		if (ones > 0) {
			switch (ones) {
			case 1:
				result.append("I");
				break;
			case 2:
				result.append("II");
				break;
			case 3:
				result.append("III");
				break;
			case 4:
				result.append("IV");
				break;
			case 5:
				result.append("V");
				break;
			case 6:
				result.append("VI");
				break;
			case 7:
				result.append("VII");
				break;
			case 8:
				result.append("VIII");
				break;
			case 9:
				result.append("IX");
				break;
			}
		}
	}

	private Roman() {}
}
