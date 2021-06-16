package steps;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.AutomobileInsurancePage;
import suporte.AbrirNavegadorChrome;

public class PreencherFormularioSteps {

	WebDriver driver;

	@Before
	public void setup() {

		driver = AbrirNavegadorChrome.abrirChrome();

	}

	@Dado("que estou no site da Sample")
	public void que_estou_no_site_da_sample() {

		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}

	@E("preencho os dados da aba {string} e clico em Next")
	public void preencho_os_dados_da_aba_e_clico_em_next(String aba) {

		AutomobileInsurancePage preenchePagina = new AutomobileInsurancePage(driver).abaFormulario(aba);
	}

	@E("preencho os dados da aba {string}")
	public void preencho_os_dados_da_aba(String aba) {

		AutomobileInsurancePage preenchePagina = new AutomobileInsurancePage(driver).abaFormulario(aba);

	}

	@Quando("clico em Send")
	public void clico_em_send() {

		driver.findElement(By.id("sendemail")).click();

	}

	@Então("deve ser exibida a mensagem {string} na tela")
	public void deve_ser_exibida_a_mensagem_na_tela(String mensagem) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		WebElement usuario = wait.until(ExpectedConditions.elementToBeClickable(By.className("sa-placeholder")));

		String textoElement = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();

		assertEquals(mensagem, textoElement);

	}

	@After
	public void dps() {
		driver.quit();
	}

}
