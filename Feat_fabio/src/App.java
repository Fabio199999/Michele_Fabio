public class App {
    public static void main(String[] args) throws Exception {

        Tutor Donato = new Tutor("Donato", "Mastronardi", 25, 0 );
        Donato.SomministrazioneDiAiuto();

        CollegaIfoa Mike = new CollegaIfoa("Michele", "Fortunato", 22, 1);

        CollegaIfoa Fabio = new CollegaIfoa("Fabio", "Portacci", 25, 2);

        Mike.saluta();
        Fabio.saluta();
        System.out.println(Mike.equals(Fabio));
    }
}
