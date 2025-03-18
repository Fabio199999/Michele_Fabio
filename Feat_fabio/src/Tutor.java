public class Tutor {
    String nome;
    String cognome;
    int età ;
    boolean isReady;

    public Tutor(String nome, String cognome, int età, boolean isReady) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.isReady = isReady;
    }

    public void SomministrazioneDiAiuto() {
        if (isReady  == false) {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e non posso aiutarti al momento, ma ti rispondo tra un giorno, nel dubbio chiedi a Trotti!");
        } else {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e sono pronto per aiutarti!");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
