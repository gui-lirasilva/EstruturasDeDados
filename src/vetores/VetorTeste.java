package vetores;

public class VetorTeste {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		Aluno a3 = new Aluno("Junior");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(2, a3);
		System.out.println(lista);
		
		System.out.println(lista.pega(0));
		
		System.out.println(lista.tamanho());
		
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}
