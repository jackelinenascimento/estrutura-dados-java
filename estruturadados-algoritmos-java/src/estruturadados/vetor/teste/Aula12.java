package estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();
		
		arraylist.add("A");
		arraylist.add("B");
		
		System.out.println(arraylist);

		arraylist.add(2, "C");
		
		System.out.println(arraylist);

		boolean existe = arraylist.contains("A");
		
		System.out.println(existe);
		
		int pos = arraylist.indexOf("B");
		
		System.out.println(pos);
		
	}

}
