public class Tutor extends Person{
    int isReady;

    public Tutor(String nome, String cognome, int età, int isReady) {
            super(nome, cognome, età, isReady);
            this.isReady = isReady;
        }
    

    public void SomministrazioneDiAiuto() {
        if (isReady  == 0) {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e non posso aiutarti al momento, ma ti rispondo tra un giorno, nel dubbio chiedi a Trotti!");
        } else if (isReady == 1) {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e sono pronto per aiutarti!");
        }
    }

    public int getTutor(){
        return isReady;
    }

    public void setisReady( int isReady){
        this.isReady = isReady;
    }
}
