
public class casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double)1;
		System.out.println(b);   //1이 실수로 변환 1.0  casting
		
		//int c = 1.1;
		int d = (int) 1.1;   //강제변환
		double e = 1.1;
		System.out.println(d);
		
		  // 1 to String 
        String f = Integer.toString(1);
        System.out.println(f);
        System.out.println(f.getClass());
	}

}
