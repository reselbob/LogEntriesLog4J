package com.reselbob.demo;
/*
 * Compares two numbers and report if the first
 * number, x is greater, more or less than the second
 * number y
 */
public interface NumberComparable {
	CompareState compare(int x, int y);
}
