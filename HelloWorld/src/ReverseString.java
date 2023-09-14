
public class ReverseString {
	
	public static void findMissing(int arr[], int N) {
		int i;
		int temp[] = new int[N+1];
		for(i=0; i<=N; i++) {
			temp[i] = 0;
		}
		for(i=0; i<N; i++) {
			temp[arr[i]-1] =1;
			
		}
		int ans = 0;
		for (i=0; i<=N; i++) {
			if(temp[i] == 0)
				ans = i +1;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 5, 6, 7, 8};
		int n = arr.length;
		findMissing(arr, n);
		
		/*String name1 = "Prestige", name2 = " ";
		char ch;
		for(int i=0;i<name1.length();i++) {
			ch= name1.charAt(i);
			name2 = ch+name2;
		}
		System.out.println("Original word "+ name1);
		System.out.println("Reversed word "+ name2);*/
	}
}
