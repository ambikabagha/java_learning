package extra_Topics;

public class CommandLineArguments {
	public static void main(String[] args) {
		System.out.println(args[0]);
		CommandLineArguments ca = new CommandLineArguments();
		ca.add(2, 3);
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

}
