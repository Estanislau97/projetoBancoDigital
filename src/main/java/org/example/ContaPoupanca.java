package BancoDigital;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("================================");
		System.out.println("Extrato da conta poupança:\n");
		super.imprimirInfosComuns();
	}
	
}
