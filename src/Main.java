//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome,
// gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("MARIO","ROSSI");
        Person persona =builder.build();
        System.out.println(persona);

        Person persona1 = new Person("MARCO","GATTI",24,"Via Roma");
        System.out.println(persona1);
    }
}