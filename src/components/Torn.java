/*
 * Classe que defineix un torn. Un torn es defineix pel seu codi, nom, hora d'inici
 * i hora d'acabament del torn.
 */
package components;

/**
 *
 * @author root
 */

import java.util.Scanner;

public class Torn {

    private final static Scanner DADES = new Scanner(System.in);

    private String codi;
    private String nom;
    private String horaInici;
    private String horaAcabament;

    /*
     TODO CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */

    public Torn(String codi, String nom, String horaInici, String horaAcabament) {
        this.codi = codi;
        this.nom = nom;
        this.horaInici = horaInici;
        this.horaAcabament = horaAcabament;
    }

     /*
     TODO Mètodes accessors
     */

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }

    public String getHoraAcabament() {
        return horaAcabament;
    }

    public void setHoraAcabament(String horaAcabament) {
        this.horaAcabament = horaAcabament;
    }

    /*
         TODO
         Paràmetres: cap
         Accions:
         - Demanar a l'usuari les dades per consola per crear un nou torn. Les dades
         a demanar són les que passem per paràmetre en el constructor.
         - Per assignar les hores d'inici i acabamanet del torn, heu d'utilitzar el mètode
         escaient d'aquesta classe.
         Retorn: El nou torn creat.
         */
    public static Torn addTorn() {
        System.out.println("Introduzca el codigo del turno");
        String codi = DADES.nextLine();
        System.out.println("Introduzca el nombre del turno");
        String nom = DADES.nextLine();
        System.out.println("Introduzca la hora de inicio del turno");
        String horaInici = horesTorn();
        System.out.println("Introduzca la hora de finalizacion del turno");
        String horaFinal = horesTorn();
        return new Torn(codi, nom, horaInici, horaFinal);
    }

    /*
     TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte (Penseu com heu de
     modificar les hores d'inici i d'acabament del torn).
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     Retorn: cap
     */
    public void updateTorn() {
        this.showTorn();
        System.out.println("Introduce el nuevo codigo del turno:");
        String codi = DADES.next();
        System.out.println("Introduce el nuevo nombre del turno:");
        String nom = DADES.next();
        System.out.println("Introduce la nueva hora de inicio del turno:");
        String horaInici = horesTorn();
        System.out.println("Introduce la nueva hora de fin del turno:");
        String horaFinal = horesTorn();
    }

    public void showTorn() {
        System.out.println("\nLes dades del torn amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nHora d'inici: "+horaInici);
        System.out.println("\nHora d'acabament: "+horaAcabament);
    }

    /*
     TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear les hores d'inici o acabament
     d'un torn.
     - Tant l'hora d'inici com la d'acabament, han de tenir el format "hh:mm", on
     hh és l'hora en format 24 hores i mm els minuts. Perquè es respecti el format,
     primer demanarem l'hora a l'usuari i després els minuts. El mateix mètode és
     el que haurà de crear el format correcte amb les dades introduïdes per l'usuari.
     - Heu de controlar que les hores i minuts introduïts siguin correctes. Si no
     és així, se li tornaran a demanar a l'usuari fins que introdueixi unes dades correctes.
     Retorn: Les hores d'inici o acabament del torn.
     */
    public static String horesTorn() {
        System.out.println("Introduce las horas:");
        String hores = DADES.next();
        System.out.println("Introduce los minutos:");
        String minuts = DADES.next();
        return(hores +":"+ minuts);
    }
}
