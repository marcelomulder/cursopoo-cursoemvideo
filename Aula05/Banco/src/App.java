public class App {
    public static void main(String[] args) throws Exception {
        
        Conta conta1 = new Conta("00001", "cp", "Jubileu");
        conta1.abrirConta();
        conta1.depositar(300.0);

        Conta conta2 = new Conta("00002", "cc", "Creusa");
        conta2.abrirConta();
        conta2.depositar(500.0);
        conta2.sacar(100.0);

    }
}
