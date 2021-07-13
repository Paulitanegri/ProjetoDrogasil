package Steps;

import java.io.IOException;

import Metodos.Metodo;
import Pages.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Chat {

	Metodo metodo = new Metodo();
	Elementos elemento = new Elementos();
	String text = "Olá, pode me ajudar?";

	@Given("que eu    esteja {string}")
	public void que_eu_esteja(String site) {
		metodo.abrirNavegador(site);

	}

	@When("eu clicar no chat")
	public void eu_clicar_no_chat() throws InterruptedException {

	}

	@When("eu clicar no menu chat")
	public void eu_clicar_no_menu_chat() throws InterruptedException {
		Thread.sleep(1000);
		metodo.esperarClicar(elemento.getAceitar(), "clicar");
		Thread.sleep(1000);
		metodo.clicar(elemento.getChat());

	}

	@When("digito a mensagem")
	public void digito_a_mensagem() {
		metodo.preencher(elemento.getMensagem(), text);
		metodo.enviar(elemento.getEnvio(), "clicar no botão enviar");

	}

	@Then("entao finalizo o teste")
	public void entao_finalizo_o_teste() throws InterruptedException, IOException {
		Thread.sleep(1000);
		metodo.screenShot("abrirChat");
		Thread.sleep(1000);
		metodo.clicar(elemento.getEncerrar());

	}
}
