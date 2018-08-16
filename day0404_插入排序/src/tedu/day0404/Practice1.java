package tedu.day0404;

import java.util.Arrays;
import java.util.Random;

public class Practice1 {

	public static void main(String[] args) {
		int[] arr1 = get();
		sort(arr1);
	}

	private static void sort(int[] arr1) {
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.binarySearch(arr1,45));
		
/*		for(int i=0;i<arr1.length;i++) {
			boolean flag = false;
			for(int j=arr1.length-1;j>i;j--) {
				if(arr1[j-1]>arr1[j]) {
					int temp = arr1[j-1];
					arr1[j-1] = arr1[j];
					arr1[j] = temp;
				}
				flag = true;
			}
			if(!flag) {
				break;
			}
		}*/
		
/*		for(int i=1;i<arr1.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr1[j]>arr1[j+1]) {
					int temp = arr1[j+1];
					arr1[j+1] = arr1[j];
					arr1[j] = temp;
				}
			}
		}*/
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					int temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		
	}

	public static int[] get() {
	
		int len = new Random().nextInt(10)+4;
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(100);
		}
		return array;
	}
	
	
}
