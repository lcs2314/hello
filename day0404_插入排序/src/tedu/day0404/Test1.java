package tedu.day0404;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		//获得一个随机的乱序数组
		int[] a=suiji();
		System.out.println(Arrays.toString(a));
		System.out.println("============================");
		sort(a);//排序
		System.out.println("============================");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiji() {
		/*
		 * 产生[5,11)范围的随机整数值，表示数组长度len值
		 * 新建len长度的int[]数组，存到变量a
		 * 遍历数组a，随机填入100内随机值
		 * return数组a的内存地址
		 */
		int len=5+(new Random().nextInt(6));
		int[] a=new int[len];
		for(int i=0;i<a.length;i++) {
			a[i]=new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		//数组选择排序
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("----------------------------------------");
		for(int i=1;i<a.length;i++) {
			//把i位置的值，向前移动，插到它该在的位置
			for(int j=i-1;j>=0;j--) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}else {
					break;
				}
				System.out.println(Arrays.toString(a));
			}
		}
		
	}
	
}
