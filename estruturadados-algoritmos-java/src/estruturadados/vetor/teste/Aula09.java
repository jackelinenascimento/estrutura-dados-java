package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		

		Vetor vetor = new Vetor(10);
			
			vetor.adiciona("B");
			vetor.adiciona("C");
			vetor.adiciona("D");
			vetor.adiciona("E");
			vetor.adiciona("F");
			vetor.adiciona("G");
			
			System.out.println(vetor);
			
			vetor.remove(0);
			
			System.out.println(vetor);
	}
}
