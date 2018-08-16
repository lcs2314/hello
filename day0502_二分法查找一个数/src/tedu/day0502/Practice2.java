package tedu.day0502;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		int[] array = {20,45,35,78,56,12};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int a = 45;
		int num = find(array,a);
		System.out.println(num);
	}

	private static int find(int[] array, int a) {
		int start = 0;
		int end = array.length-1;
		int mid ;
		
		while(start<end) {
			mid = (start+end)/2;
			if(array[mid]>a) {
				end = mid-1;
				
			}else if(array[mid]<a) {
				start = start+1;
				
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}
