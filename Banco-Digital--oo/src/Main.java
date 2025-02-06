public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente("Ricardo");
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        cc.depositar(200.0);
        cc.transferir(200.0, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}