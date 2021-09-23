// Dando o nome ao arquivo /
public class Filme {
    //Declaração das variaveis privadas (encapsulamento)/
    private int codigo;
	private String nome;
	private double valor;
	private boolean disponivel;

    //Retornando os valores das variaveis do encapsulamento /
	public int getCodigo() {
		return codigo;
	}
    // Criando um metodo / 
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
    // Dando o nome a classe / 
	public String getNome() {
		return nome;
	}
    // Criando um metodo /
	public void setNome(String nome) {
		this.nome = nome;
	}
   // Dando um valor a classe / 
	public double getValor() {
		return valor;
	}
    // Criando um metodo /
	public void setValor(double valor) {
		this.valor = valor;
	}
    // Criando uma classe true ou false / 
	public boolean isDisponivel() {
		return disponivel;
	}
    // Criando um metodo /
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
    // Criando um metodo /
	public void retirar() {
		if(disponivel == true) {
			disponivel = false;
		}else{
			throw new RuntimeException("Este filme não está disponível para locação!");
		}
				
	}
    // Criando um metodo /
	public void devolver() {
		disponivel = true;
	}
	
    //Imprimindo as variavel /
	public void mostra(){
		System.out.println("Código do filme:" + this.codigo);
		System.out.println("Nome do filme:" + this.nome);
		System.out.println("Valor: R$" + this.valor);		
		System.out.println("Disponível:" + this.disponivel);
	}
	

}