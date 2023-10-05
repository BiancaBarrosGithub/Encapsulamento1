package Encapsulamento.Endereco;

public class Endereco {
	private long id;
	private String lograDouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	
	public Endereco(long id, String lograDouro, int numero, String complemento, String bairro, String cidade,
			String cep, String uf) {
		super();
		this.id = id;
		this.lograDouro = lograDouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLograDouro() {
		return lograDouro;
	}
	public void setLograDouro(String lograDouro) {
		this.lograDouro = lograDouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
