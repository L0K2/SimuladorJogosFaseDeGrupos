package br.eu.modelo;

public class Time {
	private String nome;
	private Integer pontos;
	private Integer vitorias;
	private Integer empates;
	private Integer derrotas;
	private Integer golsSofridos;
	private Integer golsPro;
	private Integer saldoDeGols;
	private Integer gptd; //Gols por partida
	
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	public Integer getVitorias() {
		return vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getEmpates() {
		return empates;
	}
	public void setEmpates(Integer empates) {
		this.empates = empates;
	}
	public Integer getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Integer getGolsSofridos() {
		return golsSofridos;
	}
	public void setGolsSofridos(Integer golsSofridos) {
		this.golsSofridos = golsSofridos;
	}
	public Integer getGolsPro() {
		return golsPro;
	}
	public void setGolsPro(Integer golsPro) {
		this.golsPro = golsPro;
	}
	public Integer getSaldoDeGols() {
		return saldoDeGols;
	}
	public void setSaldoDeGols(Integer saldoDeGols) {
		this.saldoDeGols = saldoDeGols;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getGptd() {
		return gptd;
	}
	public void setGptd(Integer gptd) {
		this.gptd = gptd;
	}
	
	
}
