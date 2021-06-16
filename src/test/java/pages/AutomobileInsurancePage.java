package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomobileInsurancePage {

	protected WebDriver driver;

	public AutomobileInsurancePage(WebDriver driver) {
		this.driver = driver;
	}

	public AutomobileInsurancePage abaFormulario(String aba) {

		if (aba.equals("Enter Vehicle Data")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement pageVehicle = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("make"))));

			WebElement comboMake = driver.findElement(By.id("make"));
			Select select = new Select(comboMake);
			select.selectByVisibleText("Audi");

			WebElement comboModel = driver.findElement(By.id("model"));
			select = new Select(comboModel);
			select.selectByVisibleText("Scooter");

			driver.findElement(By.id("cylindercapacity")).sendKeys("10");

			driver.findElement(By.id("engineperformance")).sendKeys("10");

			driver.findElement(By.id("dateofmanufacture")).sendKeys("06/15/2021");

			WebElement comboNumberSeats = driver.findElement(By.id("numberofseats"));
			select = new Select(comboNumberSeats);
			select.selectByVisibleText("1");

			 driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();

			WebElement comboNumberSeatsMotor = driver.findElement(By.id("numberofseatsmotorcycle"));
			select = new Select(comboNumberSeatsMotor);
			select.selectByVisibleText("1");

			driver.findElement(By.id("payload")).sendKeys("100");

			driver.findElement(By.id("totalweight")).sendKeys("100");

			WebElement comboFuel = driver.findElement(By.id("fuel"));
			select = new Select(comboFuel);
			select.selectByVisibleText("Petrol");

			driver.findElement(By.id("listprice")).sendKeys("600");

			driver.findElement(By.id("licenseplatenumber")).sendKeys("123");

			driver.findElement(By.id("annualmileage")).sendKeys("2021");

			driver.findElement(By.id("nextenterinsurantdata")).click();

		}
		if (aba.equals("Enter Insurant Data")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement pageInsurant = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstname"))));

			driver.findElement(By.id("firstname")).sendKeys("Angelica");

			driver.findElement(By.id("lastname")).sendKeys("Campos");

			driver.findElement(By.id("birthdate")).sendKeys("01/18/1992");

			driver.findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span")).click();

			driver.findElement(By.id("streetaddress")).sendKeys("Rua Santos");

			WebElement comboNumberSeats = driver.findElement(By.id("country"));
			Select select = new Select(comboNumberSeats);
			select.selectByVisibleText("Brazil");

			driver.findElement(By.id("zipcode")).sendKeys("14093230");

			driver.findElement(By.id("city")).sendKeys("Santos");

			WebElement comboOccupation = driver.findElement(By.id("occupation"));
			select = new Select(comboOccupation);
			select.selectByVisibleText("Employee");

			driver.findElement(By.xpath("//form[@id='insurance-form']/div/section[2]/div[10]/p/label/span")).click();

			driver.findElement(By.id("website")).sendKeys("www.angelica.com");

			driver.findElement(By.id("nextenterproductdata")).click();

		}
		if (aba.equals("Enter Product Data")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement pageProduct = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("startdate"))));

			driver.findElement(By.id("startdate")).sendKeys("01/15/2022");

			WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
			Select select = new Select(comboInsurance);
			select.selectByVisibleText("3.000.000,00");

			WebElement comboMerit = driver.findElement(By.id("meritrating"));
			select = new Select(comboMerit);
			select.selectByVisibleText("Bonus 1");

			WebElement comboDamage = driver.findElement(By.id("damageinsurance"));
			select = new Select(comboDamage);
			select.selectByVisibleText("No Coverage");

			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();

			WebElement comboCourtesyCar = driver.findElement(By.id("courtesycar"));
			select = new Select(comboCourtesyCar);
			select.selectByVisibleText("No");

			driver.findElement(By.id("nextselectpriceoption")).click();

		}
		if (aba.equals("Select Price Option")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement pagePrice = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("selectsilver"))));

			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();

			WebElement btnNext = wait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("nextsendquote"))));
			btnNext.click();

		}
		if (aba.equals("Send Quote")) {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement pageSendQuote = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));

			driver.findElement(By.id("email")).sendKeys("angelica@gmail.com");

			driver.findElement(By.id("phone")).sendKeys("123456789");

			driver.findElement(By.id("username")).sendKeys("angelica");

			driver.findElement(By.id("password")).sendKeys("Senha12345");

			driver.findElement(By.id("confirmpassword")).sendKeys("Senha12345");

			driver.findElement(By.id("Comments")).sendKeys("Teste Finalizado!");

		}

		return this;
	}

}
