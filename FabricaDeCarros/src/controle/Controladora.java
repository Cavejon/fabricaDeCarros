package controle;

import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	public void exibeMenu() {

		int opcao;

		do {
			opcao = EntradaSaida.solicitaOpcao();

			String modelo = null;
			String cor = null;
			int ano = 0;

			switch (opcao) {

			case 0:

				int qtdeCarros = EntradaSaida.solicitaQtdeCarros("Carros");
				for (int i = 0; i < qtdeCarros; i++) {

					modelo = EntradaSaida.solicitaModelo("Modelo", i + 1);
					cor = EntradaSaida.solicitaCor();
					ano = EntradaSaida.solicitaAno();

					EntradaSaida.exibeCarroCriado();

					Fabrica.fabricarCarro(modelo, cor, ano);
				}
				break;

			case 1:

				int i = 0;

				if (Fabrica.verificarListaVazia()) {
					EntradaSaida.exibeListaVazia();
				}

				System.out.println("Exclus�o do carro, veja os modelos e escolha qual quer vender!");
				System.out.println(Fabrica.infoCarro());

				modelo = EntradaSaida.solicitaModelo("Modelo", i + 1);
				cor = EntradaSaida.solicitaCor();
				ano = EntradaSaida.solicitaAno();

				if (!Fabrica.validarCarro(modelo, cor, ano) ) {
					EntradaSaida.exibeCarroInexistente();
				} 
					Fabrica.venderCarro(modelo, cor, ano);
					EntradaSaida.exibeCarroVendido();
			
				break;

			case 2:

				if (Fabrica.verificarListaVazia()) {
					EntradaSaida.exibeListaVazia();
				} else {
					System.out.println(Fabrica.infoCarro());
				}
				break;

			}
		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();
		System.exit(0);

	}
}
