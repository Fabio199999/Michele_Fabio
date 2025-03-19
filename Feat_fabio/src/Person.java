public abstract class Person {
    public String nome;
    public String cognome;
    public int età ;
    public int isReady;

    public Person(String nome, String cognome, int età, int isReady) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.isReady = isReady;
    }
    //



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
