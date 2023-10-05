package entities;

import java.util.Random;

public class Fornecedor {

	Random random = new Random();
	private int id;
	private String razaosocial;
	private int cnpj;

	public Fornecedor(int id) {
		this.id=id;
	}
	public Fornecedor(String razaosocial, int cnpj) {
		this.id = random.nextInt(100);
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
	}

	public int getId() {
		return id;
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