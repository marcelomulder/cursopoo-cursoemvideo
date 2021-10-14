import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }
    

    public Lutador getDesafiado() {
        return desafiado;
    }



    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }



    public Lutador getDesafiante() {
        return desafiante;
    }



    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }



    public int getRounds() {
        return rounds;
    }



    public void setRounds(int rounds) {
        this.rounds = rounds;
    }



    public boolean isAprovada() {
        return aprovada;
    }



    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }



    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }        

    }

    public void lutar(){
        if (aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("#################\n");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("##################\n");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("### RESULTADO ###\n");
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Luta empatada!\n");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado ganha
                    System.out.println("Vitória de "+ this.desafiado.getNome() +"\n");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();                    
                    break;
                case 2: // Desafiante ganha
                    System.out.println("Vitória de "+ this.desafiante.getNome() +"\n");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

            }

        } else{
            System.out.println("Luta não aprovada");
        }
        
    }    
    
}
