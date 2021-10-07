package classe;

public class Usuario {

	String nome;
	String usuario;
	
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario){ 
			
		Usuario outro = (Usuario) objeto; //aqui há uma conversão de Object
		//para Usuario, pois eu preciso COMPARAR DUAS INSTÂNCIAS DA CLASSE USUARIO
			
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.usuario.equals(this.usuario);
			
		return nomeIgual && emailIgual;
	} else {
		return false;
	}
	
	}
	
}
