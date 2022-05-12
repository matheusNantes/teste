
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(100);
		cc.transfere(100, cp);
		
		System.out.println("Saldo da CC = "+ cc.getSaldo());
		System.out.println("Saldo da CP = "+ cp.getSaldo());
		
		
	}

}
