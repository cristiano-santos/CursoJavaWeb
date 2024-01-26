package modulo.data;

import java.time.Duration;
import java.time.Instant;

public class DataComInstant {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(5000);
		
		Instant iFinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, iFinal);
		
		System.out.println("Duração em milisegundos " + duracao.toMillis());
		
		System.out.println("Duração em nanosegundos " + duracao.toNanos());
		
		System.out.println("Duração em segundos " + duracao.toSeconds());
	}
}
