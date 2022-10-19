package Pratica5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;


public class Questao2 {

	public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
		Deque<Pessoa> dq = new ArrayDeque<>();
		Pessoa p1 = null;
		String nome = null, telefone = null,email = null;  
		Iterator<Pessoa> itr;
		int opcao;
	do {	
            
            System.out.println("######### MENU #########");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Consultar ordem Cecrescente");
            System.out.println("[3] - Consultar ordem Decrescente");
            System.out.println("[4] - Sair");
            System.out.println("######################");
            
            System.out.println("\n\n");
            
		opcao = ler.nextInt();
                
		switch (opcao){
		case 1:	
                        System.out.println("Cadastrar pessoa");
                        p1 = new Pessoa(nome,telefone,email);
                        System.out.println("Entrar com os dados:");
                        nome = ler.nextLine();
                        telefone = ler.nextLine();
                        email = ler.nextLine();
                        
			dq.add(p1);
			break;
		case 2:
		   for (itr = dq.iterator();itr.hasNext();) {
                         String mostraDados = itr.next().mostraDados();
           }
			break;
			 
		case 3:
			for (itr = dq.descendingIterator(); itr.hasNext();) {
                        String mostraDados = itr.next().mostraDados();
	           }
			 break;
		case 4:
			 break;	 
		}
	}while(opcao!=4);
	}

}