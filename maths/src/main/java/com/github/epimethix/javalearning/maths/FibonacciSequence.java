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

public final class FibonacciSequence {

	/*
	 * Wikipedia:
	 * 
	 * In mathematics, the Fibonacci sequence is a sequence in which each number is
	 * the sum of the two preceding ones. Numbers that are part of the Fibonacci
	 * sequence are known as Fibonacci numbers, commonly denoted Fn . The sequence
	 * commonly starts from 0 and 1, although some authors start the sequence from 1
	 * and 1 or sometimes (as did Fibonacci) from 1 and 2. Starting from 0 and 1,
	 * the sequence begins:[1]
	 * 
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
	 * 
	 * The Fibonacci numbers were first described in Indian mathematics,[2][3][4] as
	 * early as 200 BC in work by Pingala on enumerating possible patterns of
	 * Sanskrit poetry formed from syllables of two lengths. They are named after
	 * the Italian mathematician Leonardo of Pisa, also known as Fibonacci, who
	 * introduced the sequence to Western European mathematics in his 1202 book
	 * Liber Abaci.[5]
	 */

	/**
	 * Creates a list of Fibonacci numbers up to the specified count.
	 * 
	 * @param count the count between 3 and 93.
	 * 
	 * @throws IllegalArgumentException if the count is not between 3 and 93
	 *                                  (inclusive)
	 */
	public static final void printFibonacciSequence(int count) throws IllegalArgumentException {
//		Max = 9,223,372,036,854,775,807
//		f93 = 7,540,113,804,746,346,429
		if (count < 3 || count > 93) {
			throw new IllegalArgumentException(
					String.format("count must be (count > 2 && count < 94) but is %d!", count));
		}
		long a = 0;
		long b = 1;
		long c;
		System.err.print(a);
		System.err.print(" (1)");
		System.err.println();
		System.err.print(b);
		System.err.print(" (2)");
		System.err.println();
		int i = 3;
		do {
			c = a + b;
			System.err.printf("%,d (%,d)%n", c, i);
			a = b;
			b = c;
		} while (i++ < count);
	}

	public static void main(String[] args) {
		printFibonacciSequence(93);
	}

	private FibonacciSequence() {}
}
