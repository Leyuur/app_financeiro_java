package model;

public class Usuario {
	
	private int id;
	private String usuario;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(int id, String usuario, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario(String usuario, String nome, String email, String senha) {
		this.nome = nome;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
	}


	public void setId(int id) {
		this.id = id;
	}
        
        public int getId(){
        
            return id;
        }

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
