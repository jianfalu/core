package net.poc.core.ds.basic;

public class BasicTest {
	public void calculat1() {
		int i = 8;
		int result = i++ + i++;
		System.out.println("i=" + i);
		System.out.println("result=" + result);

	}

	public void calculat2() {
		Integer i = -127;
		Integer j = -127;
		int kk=	System.identityHashCode(i);
		System.out.println(	System.identityHashCode(i)+"=="+System.identityHashCode(j));
		
		if (i == j) {
			System.out.println("i==j, i=" + i);
		}

	}
	
	public void reverse(String str){
		
		String str1="ABC123";
		
	}

	public static void main(String[] args) {
		BasicTest test = new BasicTest();
		test.calculat2();

	}
}
