package cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage {

	private static final String URL_HOMEPAGE = "http://automationpractice.com/index.php";
	private WebDriver browser;
	
	public CadastroPage() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.browser = new ChromeDriver();
		this.browser.navigate().to(URL_HOMEPAGE);
	}

	public void fechar() {
		this.browser.quit();
	}

	public void navegarParaPaginaDeAutenticacao() {
		browser.findElement(By.linkText("Sign in")).click();	
	}

	public void enderecoDeEmail() {
		browser.findElement(By.id("email_create")).sendKeys("testeselenium1@gmail.com");
		
	}

	public void preenchendoFormularioDeUsuario() {
		browser.findElement(By.id("customer_firstname")).sendKeys("test");
		browser.findElement(By.id("customer_lastname")).sendKeys("selenium");
		browser.findElement(By.id("passwd")).sendKeys("desafio");
		browser.findElement(By.id("address1")).sendKeys("Avenida Paulista");
		browser.findElement(By.id("city")).sendKeys("São Paulo");
		Select state = new Select(browser.findElement(By.id("id_state")));
		state.selectByValue("1");
		browser.findElement(By.id("postcode")).sendKeys("12345");
		browser.findElement(By.id("phone_mobile")).sendKeys("123456789");
	}

	public void validarEmail() {
		browser.findElement(By.id("SubmitCreate")).click();
	}

	public void registrarUsuario() {
		browser.findElement(By.id("submitAccount")).click();
	}

	public boolean isMinhaConta() {
		return browser.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account");
	}

	public void voltarParaHomePage() {
		browser.findElement(By.linkText("Home")).click();
	}

	public void addAoCarrinho() {
		browser.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span")).click();	
	}

	public void produtoAddAoCarrinho() {
		browser.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();	
	}

	public void resumoDoCarrinho() {
		browser.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();	
	}

	public void enderecoDeEntrega() {
		browser.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();	
	}

	public void termosDeServico() {
		browser.findElement(By.id("cgv")).click();
		browser.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	}

	public void escolhaMetodoDePagamento() {
		browser.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
	}

	public void metodoDePagamento() {
		browser.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();	
	}

	public void confirmacaoDoPedido() {
		browser.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));
	}
}
