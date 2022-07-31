package accounts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ManageAccountPfTest {

	ManageAccountPf clientPF;

	@Before
	public void executeBeforeTest() {

		clientPF = new ManageAccountPf();

	}

	@Test
	public void registerClientPF() {
		// clientPF.register("Robson Silva", "1234");
		assertEquals("Registered with success", clientPF.register("Robson Silva", "1234"));

	}

	@Test
	public void registerClientEmpty() {
		assertEquals("Type your name or cpf", clientPF.register("", "1234"));

	}

	@Test
	public void registerClientBlanck() {
		assertEquals("Type your name or cpf", clientPF.register("    ", "1234"));

	}

	@Test
	public void registerClientNull() {
		assertEquals("Type your name or cpf", clientPF.register(null, "1234"));

	}
	
	@Test
	public void checkClient() {
		String name = "Vitoria";
		String cpf = "7896";
		clientPF.register(name, cpf);
		assertEquals("Name: " + name +" CPF: " + cpf, clientPF.checkClient(cpf));

	}
	
	@Test
	public void checkClientInvalid() {
		String name = "Vitoria";
		String cpf = "7896";
		String cpfInvalid = "123";
		clientPF.register(name, cpf);
		assertEquals("Type a registered name and cpf", clientPF.checkClient(cpfInvalid));

	}
}
