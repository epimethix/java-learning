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

public final class Primes {
	/*
	 * Wikipedia:
	 * 
	 * A prime number (or a prime) is a natural number greater than 1 that is not a
	 * product of two smaller natural numbers. A natural number greater than 1 that
	 * is not prime is called a composite number. For example, 5 is prime because
	 * the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.
	 * However, 4 is composite because it is a product (2 × 2) in which both numbers
	 * are smaller than 4
	 * 
	 * The first 25 prime numbers (all the prime numbers less than 100) are:
	 * 
	 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
	 * 73, 79, 83, 89, 97 (sequence A000040 in the OEIS).
	 * 
	 * Ziegler, Günter M. (2004). "The great prime number record races". Notices of
	 * the American Mathematical Society. 51 (4): 414–416. MR 2039814.
	 */

	/**
	 * find prime numbers up to the specified limit.
	 * 
	 * @param limit   the upper limit (exclusive) for numbers to inspect
	 * 
	 * @param verbose true to print all inspected numbers
	 */
	public static final void printPrimes(long limit, boolean verbose) {
		long test = 2;
		int screenWidth = 120;
		int screenCursor = 0;
		int discoveredCounter = 0;
		long start = System.currentTimeMillis();
		do {
			boolean isPrime = true;
			for (long l = test - 1; l > 1; l--) {
				if (test % l == 0L) {
					isPrime = false;
					break;
				}
			}
			if (isPrime || verbose) {
				String number = String.valueOf(test);
				if (screenCursor + number.length() + 2 > screenWidth) {
					System.err.println();
					screenCursor = 0;
				}
				if (isPrime) {
					discoveredCounter++;
					System.err.print(number);
					System.err.print("; ");
				} else if (verbose) {
					System.out.print(number);
					System.out.print("; ");
				}
				screenCursor += number.length() + 2;
			}
		} while (++test < limit);
		System.err.printf("%n%nsearch for primes up to %,d resulted in %,d matches and took %,d seconds%n", limit,
				discoveredCounter, (System.currentTimeMillis() - start) / 1000);
	}

	public static void main(String[] args) {
		printPrimes(100L, false);
	}

	private Primes() {}
}
