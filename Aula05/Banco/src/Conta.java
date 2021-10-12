

public class Conta {
    public String conta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(String conta, String tipo, String dono) {
        this.conta = conta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0.0;
        this.status = false;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        this.status = true;
        
        if (this.tipo == "cc"){
            this.saldo = 50.0;
        } else {
            this.saldo = 150.0;
        }

        System.out.println("CONTA DO CLIENTE "+ dono +" ABERTA. SALDO ATUAL = R$ "+ this.saldo);

    }

    public void fecharConta(){
        if (this.saldo > 0.0){
            System.out.println("VOCÊ POSSUI SALDO NA CONTA. ZERE-A PARA FECHÁ-LA.");            
        } else if (this.saldo < 0.0){
            System.out.println("VOCÊ POSSUI DÉBITO NA CONTA. QUITE-O PARA FECHÁ-LA");
        } else{
            this.status = false;
            System.out.println("CONTA DO CLIENTE "+ dono +" FECHADA!");            
        }
    }

    public void depositar(double valor){
        if (this.status){
            this.saldo += valor;
            System.out.println("VALOR R$ "+ valor +" ADICIONADO. SALDO ATUAL = R$ "+ this.saldo);
        } else{
            System.out.println("ESTA CONTA ENCONTRA-SE FECHADA. ENTRE EM CONTATO COM O ATENDIMENTO.");
        }

    }

    public void sacar(double valor){
        if (this.status){
            if (this.saldo < valor){
                System.out.println("SALDO INSUFICIENTE!");
            } else{
                this.saldo -= valor;
                System.out.println("VALOR R$ "+ valor +" SACADO. SALDO ATUAL = R$ "+ this.saldo);
            }

        } else{
            System.out.println("ESTA CONTA ENCONTRA-SE FECHADA. ENTRE EM CONTATO COM O ATENDIMENTO.");
        }

    }

    public void pagarMensal(){
        if (this.tipo == "cc"){
            this.saldo -= 12;
            System.out.println("MENSALIDADE DE R$ 12,00 PAGA. SALDO ATUAL = R$ "+ this.saldo);

        } else{            
            this.saldo -= 20;
            System.out.println("MENSALIDADE DE R$ 20,00 PAGA. SALDO ATUAL = R$ "+ this.saldo);
            
        }
    }




    
}
