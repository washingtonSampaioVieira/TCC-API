package godinner.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RestauranteExibicao extends Restaurante {

	private String distancia;
	private String tempoEntrega;
	private Double nota;
	private Integer id;

	@JsonIgnore
	private String email;

	@JsonIgnore
	private String senha;
	private String razaoSocial;

	@JsonIgnore
	private String cnpj;
	private String telefone;

	@JsonIgnore
	private Endereco endereco;
	private String foto;
	private Double valorEntrega;

	public Double getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(Double valorIntrega) {
		this.valorEntrega = valorIntrega;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public String getTempoEntrega() {
		return tempoEntrega;
	}

	public void setTempoEntrega(String tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}

	@Override
	public String toString() {
		return "RestauranteExibicao [distancia=" + distancia + ", tempoEntrega=" + tempoEntrega + ", nota=" + nota
				+ ", id=" + id + ", email=" + email + ", senha=" + senha + ", razaoSocial=" + razaoSocial + ", cnpj="
				+ cnpj + ", telefone=" + telefone + ", endereco=" + endereco + ", foto=" + foto + "]";
	}
}