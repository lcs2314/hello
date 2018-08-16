package tedu.day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int[] a=f();
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//优化的快速排序算法
		System.out.println(Arrays.toString(a));
		System.out.println("输入查找的目标：");
		int t=new Scanner(System.in).nextInt();
		//二分法查找
		int index=binarySearch(a,t);
		if(index>=0) {
			System.out.println(t+"在"+index+"位置");
		}else {
			System.out.println("找不到目标值"+t);
		}
		System.out.println("-----------------------------");
		Arrays.toString(a);
		Arrays.sort(a);
		int[] arry=new int[10];
		Arrays.binarySearch(a,25);
		Arrays.copyOf(a,10); //创建一个新的数组
		//Arrays.fill(a,90);
		System.out.println(Arrays.toString(a));
		System.arraycopy(a, 2, arry, 0, 3); //被复制的数组要先创建
		System.out.println(Arrays.toString(arry));
		
		System.out.println("-----------------------------");
		
		
		
		
		
		
		

	}

	private static int binarySearch(int[] a, int t) {
		/*
		 * 在数组a中找到目标t
		 */
		int lo=0;
		int hi=a.length-1;
		int mid;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(a[mid]>t) {
				hi=mid-1;
			}else if(a[mid]<t) {
				lo=mid+1;
			}else {
				return mid;
			}
			
		}
		return -1;
	}

	private static int[] f() {
		int len=new Random().nextInt(6)+5;
		int[] a=new int[len];
		for(int i=0;i<a.length;i++) {
			a[i]=new Random().nextInt(100);
		}
		return a;
	}

}
