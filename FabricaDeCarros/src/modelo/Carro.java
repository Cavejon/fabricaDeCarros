package modelo;

public class Carro {

	private String cor;
	private String modelo;
	private int ano;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String imprimir() {
		
		return "\n Modelo: "+modelo+"\n Cor: "+cor+"\n Ano: "+ano;
	}

}
