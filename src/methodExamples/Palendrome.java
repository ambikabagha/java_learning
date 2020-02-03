package methodExamples;

public class Palendrome {
	public void stringPalendromeCheck(String str) {
		char[] ch = str.toCharArray();
		boolean isPal = true;
		for (int i = 0; i < ch.length / 2;) {
			if (ch[i] == ch[ch.length - i - 1]) {
				i++;
			} else {
				isPal = false;
				break;
			}
		}

		if (isPal) {
			System.out.println("palendrome");
		} else {
			System.out.println("not palendrome");
		}
	}

	

	public static void main(String[] args) {
		
		Palendrome obj = new Palendrome();
		obj.stringPalendromeCheck("icici");
		
	}

}
