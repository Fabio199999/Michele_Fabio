public class CollegaIfoa extends Tutor {
    boolean isTyredOfWorkingFor360ConsulenzaSrlrs;
    
    public CollegaIfoa(String nome, String cognome, int età, boolean isReady, boolean isTyredOfWorkingFor360ConsulenzaSrlrs) {
        super(nome, cognome, età, isReady);
        this.isTyredOfWorkingFor360ConsulenzaSrlrs = isTyredOfWorkingFor360ConsulenzaSrlrs;
    }

    public void saluta(){
        if (isTyredOfWorkingFor360ConsulenzaSrlrs == true) {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e sono stanco di lavorare per 360ConsulenzaSrlrs");
        } else {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e sono pronto per lavorare per 360ConsulenzaSrlrs");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome  = cognome;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof CollegaIfoa){
            CollegaIfoa c1 = (CollegaIfoa) obj;
            return this.nome == c1.nome && this.cognome == c1.cognome;                    
        }

        return false;
    }

}
