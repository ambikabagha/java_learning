package LogicalOperator;

public class UsingBothAndNOr {
	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=a&&b;
		System.out.println(c);
		System.out.println(a||b);
		System.out.println(a&&b);
		System.out.println(a&&b&&c);
		System.out.println(a||b||c);
	}

}
