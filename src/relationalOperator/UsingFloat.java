package relationalOperator;

public class UsingFloat {
	public static void main(String[] args) {
		float a=9.10f;
		float b= 21.3f;
		float c=9.10f;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);
		System.out.println(a!=b);
		System.out.println(a!=c);
		System.out.println(c!=b);
		System.out.println(a<b);
		System.out.println(b<a);
		System.out.println(b<c);
		System.out.println(a<=b);
		System.out.println(b<=c);
		System.out.println(c<=b);
		System.out.println(a>b);
		System.out.println(b>a);
		System.out.println(b>c);
		System.out.println(a>=b);
		System.out.println(b>=c);
		System.out.println(b>=a);
	}

}
