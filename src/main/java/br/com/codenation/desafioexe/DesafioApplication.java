package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {

		List<Integer> listFibo = new ArrayList<>();
		listFibo.add(0);
		listFibo.add(1);

		int primeiroElem = 0;
		int segundoElem = 1;
		int atual = 0;

		while(atual <= 350){
			atual = primeiroElem + segundoElem;
			listFibo.add(atual);
			primeiroElem = segundoElem;
			segundoElem = atual;
		}


		return listFibo;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}