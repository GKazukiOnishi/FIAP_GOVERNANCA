//Classe que gera mensagens de boas vindas ao usu�rio
public class MensagemBoasVindas {

	//atributo do nome do usu�rio
	private String nome;
	
	//construtor que inicializa o nome do usu�rio
	public MensagemBoasVindas(String nome) {
		this.nome = nome;
	}
	
	//m�todo que diz boas vindas e retorna a mensagem
	public String dizerBoasVindas() {
		String mensagem = "Seja bem vindo � sua calculadora digital, ";
		System.out.print(mensagem);
		return mensagem;
	}
	
	//m�todo que diz o complemento da mensagem e retorna ela
	public String dizerComplemento() {
		String mensagem = nome + "! Confira os resultados dos testes no painel da JUNIT!";
		System.out.println(mensagem);
		return mensagem;
	}
	
}
