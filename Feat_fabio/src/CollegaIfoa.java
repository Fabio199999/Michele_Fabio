public class CollegaIfoa extends Person {
    int isTyredOfWorkingFor360ConsulenzaSrlrs;
    
    public CollegaIfoa(String nome, String cognome, int età, int isTyredOfWorkingFor360ConsulenzaSrlrs) {
        super(nome, cognome, età, isTyredOfWorkingFor360ConsulenzaSrlrs);
        this.isTyredOfWorkingFor360ConsulenzaSrlrs = isTyredOfWorkingFor360ConsulenzaSrlrs;
    }

    public void saluta(){
        if (isTyredOfWorkingFor360ConsulenzaSrlrs == 1) {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e sono stanco di lavorare per 360ConsulenzaSrlrs");
        } else if(isTyredOfWorkingFor360ConsulenzaSrlrs == 2)  {
            System.out.println("Ciao, sono "+nome+" "+cognome+" e sono pronto per lavorare per 360ConsulenzaSrlrs");
        }
    }

    public int getisTyredOfWorkingFor360ConsulenzaSrlrs(){
        return isTyredOfWorkingFor360ConsulenzaSrlrs;
    }

    public void setisTyredOfWorkingFor360ConsulenzaSrlrs( int isTyredOfWorkingFor360ConsulenzaSrlrs){
        this.isTyredOfWorkingFor360ConsulenzaSrlrs = isTyredOfWorkingFor360ConsulenzaSrlrs;
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
