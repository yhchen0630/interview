package interview;

public class OddEvenArray {

	public static void main(String[] args) {
	
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int j = 0;
		int k = 0;
		int sum = 0 , odd , even;
		int[] even1 = new int[num.length];
		int[] odd1 = new int[num.length];
		odd = even = num[0];
		
		for(int i = 0 ; i <num.length;i++) {
			if(num[i] % 2 ==0) {
				even += i;
			}else {
				odd += i ;
			}
		}
		System.out.println("偶數總和" + even);
		System.out.println("奇數總和" + odd);
			

		for(int i = 0 ; i <num.length;i++) {
			if(num[i] % 2 ==0) {
				even1[j] = num[i];
				j++;
			}else {
				odd1[k] = num[i];
		        k++;
			}
		}
		for(int l=0;l<j;l++) {
		    System.out.print( even1[l]);
		}
		System.out.print("\n");
		for (int o=0;o<k;o++){
		    System.out.print(odd1[o]);
		}
		}
	}
