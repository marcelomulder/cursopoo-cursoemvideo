package aula04;

public class Caneta {
    private String modelo;
    private double ponta;

    public Caneta(String modelo, double ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
    }
}
