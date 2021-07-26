package interview;

public class BubbleSort {

	public static void main(String[] args) {

		int [] data = {77,5,5,22,13,55,97,4,796,1,0,9}; //尚未排序的12個資料
		int temp; // 用來交換元素的暫存變數
		
		
	for(int i=0 ; i < data.length - 1 ; i++) {
		// 共需進行元素個數-1 輪
		for(int j = 0 ; j < data.length - 1 - i; j++) {
		// 第i輪比對到倒數第i+1個元素
			
		if(data[j] > data[j +1]) {
			temp = data[j];
			data[j] = data[j + 1];
			data[j + 1] = temp;
			
			}
		}
		for(int k :data) {
			System.out.print(" " + k);
		}
		System.out.println(" ");
		}
	}

}
