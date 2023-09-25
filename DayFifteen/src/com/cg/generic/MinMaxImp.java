package com.cg.generic;

public class MinMaxImp<T extends Comparable<T>> implements MinMax<T>{
	
	T[] values;
	
	MinMaxImp(T[] obj){
		values=obj;
	}
	@Override
	public T min() {
		// TODO Auto-generated method stub
		T o1=values[0];
		for(int i=1;i<values.length;i++)
			if(values[i].compareTo(o1)<0)
				o1=values[i];
		return o1;
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		T o1=values[0];
		for(int i=1;i<values.length;i++)
			if(values[i].compareTo(o1)>0)
				o1=values[i];
		return o1;
	}

	

}
//Comparable is interface
//compares this object with the specified object for order