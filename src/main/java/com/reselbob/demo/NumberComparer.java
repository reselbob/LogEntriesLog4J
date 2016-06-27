package com.reselbob.demo;
/**
 * Simple utility class for comparing numbers
 * @author reselbob
 *
 */

public class NumberComparer implements NumberComparable {

	/**
	 * @param x, the first number
	 * @param y, the second number
	 */
	public CompareState compare(int x, int y) {
		CompareState state = null;
		if (x > y)
			state = CompareState.More;
		if (x < y)
			state =  CompareState.Less;
		if(x == y)
			state = CompareState.Equal;
		return state;
	}
}
