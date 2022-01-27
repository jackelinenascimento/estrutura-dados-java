package estruturadados.vetor.teste;

import estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(10);
		
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		vetor.adiciona(6);
		vetor.adiciona(7);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		System.out.println(vetor);
		
		Contato c1 = new Contato("Contato 1", "1234567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "1234567", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "1234567", "contato3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);
		
	}

}
