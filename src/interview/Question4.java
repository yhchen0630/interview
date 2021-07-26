package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {
		int [ ] a = {77,5,5,22,13,55,97,4,796,1,0,9};
		int [ ] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//陣列C = A陣列 交集 B陣列 答案： 0, 1, 9, 4, 5 
		 List<Integer> c=new ArrayList<>();

		 Arrays.sort(a);
         Arrays.sort(b);
         int p1=0, p2=0;
         while (p1<a.length&&p2<b.length)
         {
             if(a[p1]<b[p2])
             {
                 p1++;
             }else if(a[p1]>b[p2])
             {
                 p2++;   
             }
             else 
             {
                 c.add(a[p1]);//交集的元素

                 p1++;
                 p2++;
                 while (p1<a.length&&a[p1]==a[p1-1])//跳過相同的數字
                     p1++;
                 while (p2<b.length&&b[p2]==b[p2-1])
                     p2++;   
             }

         }
         System.out.println("1.陣列c = 陣列a 交集 陣列b：");
         System.out.println(c);



		
//		//陣列D = A陣列 差集 B陣列 答案： 2, 3, 6, 7, 8
         /******************************************************************************************/

		
		int clength =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					clength ++;
				}
			}	
		}
		//System.out.println(clength);//c陣列長度為6 交集的陣列長度
		int[] c1 = new int[clength];   //c陣列
		
		
		clength=0;//將長度歸0從頭開始算並列出陣列
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c1[clength++] = a[i];
				}
			}	
		}

		/******************************************************************************************/
		System.out.println("2.陣列d = 陣列a 差集 陣列b");
		//陣列a 差集 陣列b 就是陣列a扣掉交集的部分
		//陣列d 長度
		int dlength = a.length - c1.length;
		int[] d = new int[dlength];//d陣列
		dlength=0;
		for(int i=0;i<a.length;i++) {
			int matchCount=0; //這裏做一個計算器，如果一樣就不動作
			for(int j=0;j<c1.length;j++) {
				if(a[i]==c1[j]) {
					matchCount++; //如果a[]和c[]出現一樣的 就++
				}
			}//for迴圈全部比對完，才會做判斷
				if(matchCount==0) {
					d[dlength++] = a[i];
				}//如果計算器是0就把a[]值指派給d[]
		}
		
		System.out.printf("d[%d]= { ",d.length);
		for(int dAns:d) {
			System.out.printf("%d ",dAns);
		}//for-each
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		System.out.println();
		System.out.println("3.陣列e = 陣列a 聯集 陣列b");
		//陣列a 聯集 陣列b = (陣列a + 陣列b) - (陣列c)*2
		//or  陣列a 聯集 陣列b = 陣列d + 陣列b
		//陣列d = 陣列a 差集 陣列b
		
		int elength = d.length + b.length; //取得陣列e長度
		int[] e = new int[elength];//e陣列
		
		elength = 0;
		for(int i =0;i<d.length;i++) {
			e[elength++] = d[i];
		}
		for(int j =0;j<b.length;j++) {
			e[elength++] = b[j];
		}
		
		System.out.printf("e[%d]= { ",e.length);
		for(int eAns: e) {
			System.out.printf("%d ",eAns);
		}//for-each		
		System.out.print("}");
		System.out.println();
		
		
		/******************************************************************************************/
		
	}
}