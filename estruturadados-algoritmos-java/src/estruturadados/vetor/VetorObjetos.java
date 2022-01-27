package estruturadados.vetor;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(Object elemento) { for(int i=0; i<this.elementos.length;
	 * i++) { if(this.elementos[i] == null) { this.elementos[i] = elemento; break; }
	 * } }
	 */

	/*
	 * public void adiciona(Object elemento) throws Exception {
	 * 
	 * if (this.tamanho < this.elementos.length) { this.elementos[this.tamanho] =
	 * elemento; this.tamanho++; } else { throw new
	 * Exception("Vetor já está cheio, não é possivel adicionar mais elementos"); }
	 * }
	 */

	public boolean adiciona(Object elemento){
		aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	public boolean adiciona(int posicao, Object elemento){
		aumentaCapacidade();
		verificaPosicaoValida(posicao);
		
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao) {
		verificaPosicaoValida(posicao);
		return this.elementos[posicao];
	}

	private void verificaPosicaoValida(int posicao) {
		if(!(posicao>=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
	}
	
	public int busca(String elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao) {
		verificaPosicaoValida(posicao);
		
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}

}
