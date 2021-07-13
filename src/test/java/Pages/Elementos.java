package Pages;

import org.openqa.selenium.By;

public class Elementos {

	private By menu = By
			.cssSelector("#fixed-container-styles > header > div > a > div > span > div > svg > path:nth-child(2)");
	private By texto = By.name("search");
	private By botao = By.xpath("//*[@id=\"__next\"]/main/div/div/div/div/div/div/div/div/form/div/button");
	private By aceitar = By.id("onetrust-accept-btn-handler");

	public By getMenu() {
		return menu;
	}

	public By gettexto() {
		return texto;
	}

	public By getBotao() {
		return botao;
	}

	public By getAceitar() {
		return aceitar;
	}// modo publico Chat

	// elementos Chat
	private By chat = By.xpath("//*[@id=\"open-converse\"]");
	private By mensagem = By.id("user-input");
	private By envio = By.xpath("//*[@id=\"chat-window\"]/form/button");
	private By encerrar = By.xpath("//*[@id=\"chat-window\"]/div[1]/div[3]");

	// Produtos mais visitados
	private By clickVisitados = By.xpath("//*[@id=\"__next\"]/main/div/div/div[12]/div/div/div[1]/div[1]/a/div/img");

	public By getClickVisitados() {
		return clickVisitados;
	}

	public By getTexto() {
		return texto;
	}

	public By getChat() {
		return chat;
	}

	public By getMensagem() {
		return mensagem;
	}

	public By getEnvio() {
		return envio;
	}

	public By getEncerrar() {
		return encerrar;
	}

}
