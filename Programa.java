// Dando o nome ao arquivo /
public class Programa {
    // Usando o método main /
    public static void main(String[] args) {
        // Criando objeto /
		Filme f = new Filme();
		f.setCodigo(123);
		f.setNome("A Era do Gelo");
		f.setValor(2.50);
		f.devolver();
		
		f.mostra();
		
		f.retirar();
		
		f.mostra();

		//Imprimindo as variavel /
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}