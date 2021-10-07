package colecoes;

public class Usuario {

		String nome;
		
		Usuario(String nome){
			this.nome = nome;
		}
		
		public String toString() { 
			return "Meu nome é " + nome + ".";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			Usuario outroUsuario = (Usuario) obj;
			return this.nome.equals(outroUsuario.nome);
		} 
		//System.out.println("Ana".equals(u1.nome));
		
}
