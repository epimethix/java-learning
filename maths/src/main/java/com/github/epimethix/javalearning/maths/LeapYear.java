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

public final class LeapYear {
	/*
	 * From Wikipedia:
	 * 
	 * Every year that is exactly divisible by four is a leap year, except for years
	 * that are exactly divisible by 100, but these centurial years are leap years
	 * if they are exactly divisible by 400. For example, the years 1700, 1800, and
	 * 1900 are not leap years, but the years 1600 and 2000 are.
	 * 
	 * Introduction to Calendars Archived 2019-06-13 at the Wayback Machine. (10
	 * August 2017). United States Naval Observatory.
	 */

	public static final boolean isLeapYear(long year) {
		boolean divisibleByFour = year % 4L == 0L;
		if (divisibleByFour) {
			boolean divisibleByHundred = year % 100L == 0L;
			if (divisibleByHundred) {
				boolean divisibleByFourHundred = year % 400L == 0L;
				if (!divisibleByFourHundred) {
					return false;
				}
			}
		}
		return divisibleByFour;
	}

	public static final boolean isLeapYear2(long year) {
		if (year % 4L == 0L) {
			if (year % 100L == 0L) {
				if (!(year % 400L == 0L)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static final boolean isLeapYear3(long year) {
		if (year % 4L == 0L) {
			if (year % 100L == 0L && !(year % 400L == 0L)) {
				return false;
			}
			return true;
		}
		return false;
	}

	public static final boolean isLeapYear4(long year) {
		return year % 4L == 0 && (year % 100L != 0L || year % 400L == 0L);
	}

	private LeapYear() {}
}
