package entities;

public class Fornecedor {

	private int id;
	private String razaosocial;
	private int cnpj;
	
	
	
	public Fornecedor(int id) {
		this.id = id;
	}

	public Fornecedor(){
	}

	public Fornecedor(int id, String razaosocial, int cnpj) {
		this.id = id;
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	@Override
	public String toString() {
		return "id=" + id + ", cnpj=" + cnpj + ", razaosocial=" + razaosocial + "";
	}



}