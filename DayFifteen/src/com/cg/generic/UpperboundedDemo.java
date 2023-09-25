package com.cg.generic;
import java.util.ArrayList;

public class UpperboundedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		ArrayList<Float> floatList = new ArrayList<>();
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Shobhi");
		stringList.add("Megha");
		UpperBounded.sumOfList(stringList);
	}

}
