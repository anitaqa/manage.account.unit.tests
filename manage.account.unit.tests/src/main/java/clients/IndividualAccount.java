package clients;

public class IndividualAccount {

	private String name;
	private String cpf;

	public IndividualAccount(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;

	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}
}
