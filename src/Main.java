//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome,
// gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
//Design patterns - Builder
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("MARIO","ROSSI");
        Person persona =builder.build();
        System.out.println(persona);

        Builder builder1 = new Builder("Franco","Ganni");
        builder1.setAge(33);
        builder1.setAddress("via roma");
        Person persona1 = builder1.build();
        System.out.println(persona1);
    }
}
