package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodo {

	WebDriver driver;

	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("....Error ao abrir navegador" + e.getMessage());
		}

	}

	public void preencher(By elemento, String texto) {
		try {
			Thread.sleep(2000);
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("....Error ao preencher no elemento...." + e.getMessage());
		}

	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("....Error ao clicar no elemento...." + e.getMessage());
		}
	}

	public void esperarClicar(By elemento, String descricao) {
		try {
			Thread.sleep(2000);
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("....Error ao clicar no elemento...." + e.getMessage());
		}
	}

	public void enviar(By elemento, String texto) {
		try {
			driver.findElement(elemento).submit();

		} catch (Exception e) {
			System.out.println("....Error ao dar enter no elemento" + e.getMessage());

		}
	}

	public void clicarTempo(By elemento, String descricaoPasso) throws IOException, InterruptedException {
		Thread.sleep(2000);
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {

		}

	}

	public void fechar() {
		driver.quit();

	}

	public void screenShot(String screen) throws IOException {
		TakesScreenshot printScreen = ((TakesScreenshot) driver);
		File scrFile = printScreen.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/Evidencias/" + screen + ".png");
		FileUtils.copyFile(scrFile, destFile);

	}

}
