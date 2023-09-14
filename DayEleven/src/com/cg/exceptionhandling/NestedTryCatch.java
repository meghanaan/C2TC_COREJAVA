package com.cg.exceptionhandling;

public class NestedTryCatch {
	
	public static void check() {
		String str = "Tns";
		int slength = str.length();
		System.out.println("String length:" + slength);
		String anstr= null;
		int y = 6;
		try {
			//inner try
			try {
				System.out.println(str.charAt(y));
				
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Index is out of bound: "+ e.getMessage());
				
			}
			System.out.println("String length: "+ anstr.length());
		}
		catch(NullPointerException np) {
			System.out.println("Exception is thrown: "+ np.getMessage());
		}
	}

}
//try, catch, finally, throw, throws --Exception handling keyword


