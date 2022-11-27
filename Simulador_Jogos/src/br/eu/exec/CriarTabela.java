package br.eu.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.eu.modelo.Time;

public class CriarTabela {

	public static void main(String[] args) throws IOException {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		Time t4 = new Time();
		
		System.out.println("Insira os dados do Grupo:");
		System.out.println("\n");
		
		System.out.println("Insira o nome do Time1:");
		t1.setNome(LerDados());
		System.out.println("Insira o nome do Time2:");
		t2.setNome(LerDados());
		System.out.println("Insira o nome do Time3:");
		t3.setNome(LerDados());
		System.out.println("Insira o nome do Time4:");
		t4.setNome(LerDados());
		
		System.out.println("Os times do grupo sao: " + t1.getNome() + ", "+ 
				 t2.getNome() +", "+ t3.getNome() + ", "+t4.getNome() );
		
		/*System.out.println("\n");
		System.out.println("O nome do time 1 e: "+t1.getNome());*/
		
		//PEGA OS RESULTADOS
		System.out.println("\n");
		System.out.println("1 rodada");
		System.out.println(t1.getNome()+" X "+t2.getNome());
		System.out.println(t1.getNome()+": ");
		t1.setGptd(Integer.parseInt(LerDados()));
		System.out.println(t2.getNome()+": ");
		t2.setGptd(Integer.parseInt(LerDados()));
		
		//APLICA NA TABELA
		t1.setGolsPro(t1.getGptd()); //Gols pro
		t2.setGolsPro(t2.getGptd());
		
		t1.setGolsSofridos(t2.getGptd()); //Gols Sofridos
		t2.setGolsSofridos(t1.getGptd());
		
		t1.setSaldoDeGols(t1.getGolsPro()- t1.getGolsSofridos()); //Saldo de Gols
		t2.setSaldoDeGols(t2.getGolsPro()- t2.getGolsSofridos());
		
		if (t1.getGptd() > t2.getGptd()) {	//Vitorias e derrotas
			t1.setVitorias(1);
			t2.setDerrotas(1);
			t1.setPontos(3);
		}if(t1.getGptd() < t2.getGptd()) {
			t2.setVitorias(1);
			t1.setDerrotas(1);
			t2.setPontos(3);
		}if(t1.getGptd() == t2.getGptd()){
			t1.setEmpates(1);
			t2.setEmpates(1);
		}
		
		System.out.println("\n");
		System.out.println("+----------------------------------------------------------------+\r\n"
				+ "| Posicao |Pontos| Time | Vitorias | Empates | Derrotas | GP | GS | SG  |\r\n"
				+ "| 1          "+t1.getPontos()+" "+t1.getNome()+"  "+ t1.getVitorias()+"           "+t1.getEmpates()+"     "+t1.getDerrotas()+"       "+t1.getGolsPro()+" "+t1.getGolsSofridos()+" "+t1.getSaldoDeGols()+" |\r\n"
				+ "| 2          "+t2.getPontos() +" "+t2.getNome()+"  "+ t2.getVitorias()+"        "+t2.getEmpates()+"     "+t2.getDerrotas()+"         "+t2.getGolsPro()+" "+t2.getGolsSofridos()+" "+t2.getSaldoDeGols()+" |\r\n"
				+ "| 3                                                              |\r\n"
				+ "| 4                                                              |\r\n"
				+ "+----------------------------------------------------------------+");
	}
	
	public static String LerDados() throws IOException {
		BufferedReader reader =	new BufferedReader(
				new InputStreamReader(System.in));
		String r = reader.readLine();
		return r;
		
	}
}
