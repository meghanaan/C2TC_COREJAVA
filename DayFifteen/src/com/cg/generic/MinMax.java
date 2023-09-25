package com.cg.generic;

public interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}
