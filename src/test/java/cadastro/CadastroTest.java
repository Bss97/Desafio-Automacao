package cadastro;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastroTest {

	private CadastroPage homePage;
	
	@BeforeEach
	public void beforeEach() {
		this.homePage = new CadastroPage();
	}
	
	@AfterEach
	public void afterEach() {
		this.homePage.fechar();
	}
	
	@Test
	public void preencheFormulario() throws InterruptedException {

		homePage.navegarParaPaginaDeAutenticacao();
		
		homePage.enderecoDeEmail();
		homePage.validarEmail();
		
		Thread.sleep(2000);
		homePage.preenchendoFormularioDeUsuario();
		homePage.registrarUsuario();
		Assert.assertTrue(homePage.isMinhaConta());
		
		homePage.voltarParaHomePage();
	
		homePage.addAoCarrinho();

		Thread.sleep(2000);
		homePage.produtoAddAoCarrinho();
	
		homePage.resumoDoCarrinho();
	
		homePage.enderecoDeEntrega();

		homePage.termosDeServico();

		homePage.escolhaMetodoDePagamento();

		homePage.metodoDePagamento();

		Thread.sleep(2000);
		homePage.confirmacaoDoPedido();
	}
}