package day9;

public class DisariumNumber{

	public static void main(String[] args) {
//		isDisarium(175);
//		System.out.println(isDisarium(12564));
		int n = 135;
		if(isDisarium(n)) {
			System.out.println( n + " is Disarium Number ");
			
		}else {
			System.out.println(n + " not Disarium Number");
		}
	}
		
		
		public static boolean  isDisarium(int n ) {
			
//			int revNum = 0 ;
//			int orgNum = n;
			String num = "" + n;
			int len = num.length();
			double temp = 1;
			double disno = 0;
			
			for(int i = len - 1 ; i >= 0  ; i--) {
				
//				System.out.print(num.charAt(i) + " ");
				
//				for(int j = 1 ; j <= i + 1 ; j++) {
//					
////					System.out.print(j);
////					System.out.print(num.charAt(i) + " ");
//					
//					
//			        int intValue = Integer.parseInt(num.charAt(i) + "");
//			        temp = temp * intValue;
////					System.out.println(temp);
//			        
//				}
				 double intValue = Double.parseDouble(num.charAt(i) + "");
				 
				temp = Math.pow(intValue, i +1);
				disno = disno + temp;
				
//				System.out.println(temp);
				temp = 1;
				
			}
			
//			System.out.println(disno);
			

//			while(n != 0 ) {
//				int digit = n % 10;
//				revNum = revNum * 10 + digit;
//				n /= 10;
////				return n;
//			}
			return  disno == (double)n;
			
			
			
			
		

	}

	}
