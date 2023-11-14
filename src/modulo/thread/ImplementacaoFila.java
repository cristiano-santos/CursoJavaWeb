package modulo.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFila extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFila> pilha_fila = new ConcurrentLinkedQueue<ObjetoFila>();
	
	public static void add(ObjetoFila objetoFila) {
		pilha_fila.add(objetoFila);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando!");
		
		while(true) {
			
		synchronized (pilha_fila) { /*bloqueia o acesso a lista por outros processos*/
			
			Iterator iteracao = pilha_fila.iterator();
			while(iteracao.hasNext()) { /*Enquanto contem dados na lista continua o processo.*/
				ObjetoFila processar = (ObjetoFila) iteracao.next(); /*Pega objeto atual*/
				
				/*Processo Nota fiscal*/
				/*Processo envio de email*/
				/*Processo envio de PDF*/
				System.out.println("-------------------------------------------------");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				iteracao.remove();
				
				try {
					Thread.sleep(2000); /*Tempo para descarga de memoria*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { /*Tempo apos o processo para limpeza de memoria*/
			e.printStackTrace();
		}
	}
  }

}
