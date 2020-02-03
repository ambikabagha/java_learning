package methodExamples;

public class Example3 {
	String print(String s) {
		String g=" ";
		if (s=="minu") {
			g="Menaka";
		}
		else if (s=="ambi") {
			g="Ambika";
		}
		else if (s=="chinu") {
			g="Suvsrna";
		}
		else {
			g="Others";
		}
		return g;
	}
	public static void main(String[] args) {
		Example3 e=new Example3();
		String name=e.print("minu");
		System.out.println(name);
	}

}
