package Steps;

import java.io.IOException;

import Metodos.Metodo;
import Pages.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscaLoja {

	Metodo metodo = new Metodo();
	Elementos elemento = new Elementos();
	String endereco = "Jabaquara";

//vai abrir para todos 
	@Given("que eu tenha acessado o site {string}")
	public void que_eu_tenha_acessado_o_site(String site) {

		metodo.abrirNavegador(site);

	}

	@When("eu clicar <nossas lojas>")
	public void eu_clicar_nossas_lojas() throws IOException, InterruptedException {

		metodo.esperarClicar(elemento.getAceitar(), endereco);

	}

//ate aqui!!!
	@When("digitar um endereco valido")
	public void digitar_um_endereco_valido() throws InterruptedException, IOException {
		metodo.esperarClicar(elemento.getMenu(), endereco);
		Thread.sleep(1000);
		metodo.preencher(elemento.gettexto(), "Jabaquara");

		metodo.clicar(elemento.getBotao());

	}

	@Then("eu acesso as lojas correspondentes")
	public void eu_acesso_as_lojas_correspondentes() throws IOException, InterruptedException {
		Thread.sleep(1000);
		metodo.screenShot("BuscarLojas");

	}

	@When("eu digitar um endereco invalido")
	public void eu_digitar_um_endereco_invalido() throws InterruptedException {
		metodo.esperarClicar(elemento.getMenu(), endereco);
		Thread.sleep(1000);
		metodo.preencher(elemento.gettexto(), "alface");
		metodo.clicar(elemento.getBotao());

	}

	@Then("acesso a mensagem {string}")
	public void acesso_a_mensagem(String string) throws IOException, InterruptedException {
		Thread.sleep(1000);
		metodo.screenShot("LojaNaoEncontrada");

	}

	@When("eu nao digitar nenhum endereco")
	public void eu_nao_digitar_nenhum_endereco() throws InterruptedException {
		metodo.esperarClicar(elemento.getMenu(), endereco);
		Thread.sleep(1000);
		metodo.preencher(elemento.gettexto(), "");
		metodo.clicar(elemento.getBotao());
	}


	@Then("acesso a  mensagem de {string}")
	public void acesso_a_mensagem_de(String string) throws InterruptedException, IOException {
		Thread.sleep(1000);
		metodo.screenShot("TextoObrigatorio");

		
	}
}
