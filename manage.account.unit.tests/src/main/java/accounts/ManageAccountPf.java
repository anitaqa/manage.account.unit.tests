package accounts;

import java.util.ArrayList;
import java.util.List;

import clients.IndividualAccount;

public class ManageAccountPf {

	List<IndividualAccount> pf = new ArrayList<IndividualAccount>();
	IndividualAccount client;

	public String register(String name, String cpf) {
		String msg = null;
		if (name == null) {
			msg = "Type your name or cpf";
		} else if (name.isEmpty() || name.isBlank()) {
			msg = "Type your name or cpf";
		} else {
			client = new IndividualAccount(name, cpf);
			pf.add(client);
			msg = "Registered with success";
		}
		return msg;
	}

	public String checkClient(String cpf) {
		String msg = "Name: " + client.getName() + " CPF: " + client.getCpf();

		// if(cpf != client.getCpf()) {
		if (!cpf.equals(client.getCpf())) {
			msg = "Type a registered name and cpf";
		}
		return msg;

	}
}
