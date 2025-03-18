public class App {
    public static void main(String[] args) throws Exception {

        Tutor Donato = new Tutor("Donato", "Mastronardi", 25, false);
        Donato.SomministrazioneDiAiuto();

        CollegaIfoa Mike = new CollegaIfoa("Michele", "Fortunato", 22, true, false);

        CollegaIfoa Fabio = new CollegaIfoa("Fabio", "Portacci", 25, true, true);

        Mike.saluta();
        Fabio.saluta();
        System.out.println(Mike.equals(Fabio));
    }



}
