package interview;

public class DataString {

	public static void main(String[] args) {
		String str = "人易科技:上 機 測 驗 - 演算法";
		System.out.println("原字串："+str);
		//第一題
		String str1 = "";
		char[] chars = str.toCharArray();
		
	

		for(int i = 0; i < chars.length; i++){ 

		 int tranTemp = (int)chars[i];
		 
		 if(tranTemp >46 && tranTemp < 59 )  

			 tranTemp += 65248; //Unicode編碼轉為十進位和ASCII碼的差

			 str1 += (char)tranTemp;

			}
			
			System.out.println("第一小題答案：" + str1);
			
			//第二題
			str1 = str1.replaceAll("\\s+","");
			//System.out.println("刪除空格：" +str1);
			String str2 = str1.substring(0,6)+' '+str1.substring(6);
			//System.out.println(str2);
			String str3 = str2.substring(0,8)+' '+str2.substring(8);
			//System.out.println(str3);
			String str4 = str3.substring(0,10)+' '+str3.substring(10);
			System.out.println("第二小題答案："+str4);
			
			//第三題
			char[] chars1 = new char[14];
			str4.getChars(4, 13, chars1, 0);
			System.out.print("第三小題答案： ");
			System.out.println(chars1);
			
		}
	}

