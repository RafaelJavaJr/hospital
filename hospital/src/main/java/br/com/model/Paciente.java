package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// informações pessoais
	private String nome;
	private String naturalidade;
	private String sexo;
	private String dtNascimento;

	//especificações
	private String cadastroUnico;
	private String cor;
	private String cidadeNascimento;
	private String nomeMae;
	private String nomePai;

	// endereço
	private String pais;
	private String municipio;
	private String logradouro;
	private String numero;
	private String bairro;
	private String CEP;

	// contatos
	private String telefone1;
	private String telefone2;
	private String telefoneRecado;
	private String nomeParaRecado;

	// documentos
	private String RG;
	private String CPF;
	private String CNS;

	// informações adicionais
	private String unidadeDeSaude;
	private String situacaoFamiliar;

	// educação
	private String frequentouEscola;
	private String grauEscolaridade;

	// informações trabalhistas
	private String situacaoTrabalhista;
	private String cargo;
	private String ativo;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getCadastroUnico() {
		return cadastroUnico;
	}
	public void setCadastroUnico(String cadastroUnico) {
		this.cadastroUnico = cadastroUnico;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getTelefoneRecado() {
		return telefoneRecado;
	}
	public void setTelefoneRecado(String telefoneRecado) {
		this.telefoneRecado = telefoneRecado;
	}
	public String getNomeParaRecado() {
		return nomeParaRecado;
	}
	public void setNomeParaRecado(String nomeParaRecado) {
		this.nomeParaRecado = nomeParaRecado;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCNS() {
		return CNS;
	}
	public void setCNS(String cNS) {
		CNS = cNS;
	}
	public String getUnidadeDeSaude() {
		return unidadeDeSaude;
	}
	public void setUnidadeDeSaude(String unidadeDeSaude) {
		this.unidadeDeSaude = unidadeDeSaude;
	}
	public String getSituacaoFamiliar() {
		return situacaoFamiliar;
	}
	public void setSituacaoFamiliar(String situacaoFamiliar) {
		this.situacaoFamiliar = situacaoFamiliar;
	}
	public String getFrequentouEscola() {
		return frequentouEscola;
	}
	public void setFrequentouEscola(String frequentouEscola) {
		this.frequentouEscola = frequentouEscola;
	}
	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}
	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}
	public String getSituacaoTrabalhista() {
		return situacaoTrabalhista;
	}
	public void setSituacaoTrabalhista(String situacaoTrabalhista) {
		this.situacaoTrabalhista = situacaoTrabalhista;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Paciente other = (Paciente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
