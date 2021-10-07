package generics;

public class Par<C, V> {

	//Daqui ir para a classe Pares
	
	//O nome desta classe é Par porque haverão dois tipos de variáveis: 
	// uma chave e um valor que juntos formam um par
	
	private C chave;
	private V valor;
	
	
	public Par() {
		
	}
	
	public Par(C chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public C getChave() {
		return chave;
	}
	
	public void setChave(C chave) {
		this.chave = chave;
	}
	
	public V getValor() {
		return valor;
	}
	
	public void setValor(V valor) {
		this.valor = valor;
	}
	
	//Se um par tiver a mesma chave de outro par, não irei comparar
	//porque não pode ter repetido

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//uso o interrogação abaixo porque a classe Par não tem os tipos definidos
		Par<?, ?> other = (Par<?, ?>) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		return true;
	}
	
}
