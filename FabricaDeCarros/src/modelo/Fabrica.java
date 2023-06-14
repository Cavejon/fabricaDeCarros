package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import visualizacao.EntradaSaida;

public class Fabrica {

	public static ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	// removendo um obeto da lista

	public static String venderCarro(String modelo, String cor, int ano) {

		for (Carro carro : listaDeCarros) {
			if (carro.getModelo().equalsIgnoreCase(modelo) && carro.getCor().equalsIgnoreCase(cor)
					&& carro.getAno() == (ano)) {
				listaDeCarros.remove(carro);

				return "Carro modelo " + modelo + " foi removido com sucesso";
			}
		}
		return "carro n�o encontrado";
	}
	// Adicionando um obejto na lista;

	public static void fabricarCarro(String modelo, String cor, int ano) {

		Carro carro = new Carro();

		carro.setModelo(modelo);
		carro.setCor(cor);
		carro.setAno(ano);

		listaDeCarros.add(carro);
		

	}

	public static String infoCarro() {

		String saida = "";
		int i = 1;

		for (Carro c : listaDeCarros) {
			saida += "\nLista de carros" + (i++);
			saida += c.imprimir();
		}
		return saida;

	}

	public static boolean verificarListaVazia() {

		if (listaDeCarros.isEmpty()) {

			return true;

		}
		return false;

	}

	public static boolean validarCarro(String modelo, String cor, int ano) {

		for (Carro carro : listaDeCarros) {

			if(listaDeCarros.contains(modelo) || listaDeCarros.contains(cor) || listaDeCarros.contains(ano));
	
			return true;
		}

		return false;
	}
}
