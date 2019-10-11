/*
 * Classe que defineix un dissenyador o dissenyadora. Un dissenyador o dissenyadora
 * es defineix pel seu nif, nom i estat, és a dir, actiu si està treballant o no
 * actiu si està de baixa o vacances.
 */
package components;

/**
 *
 * @author root
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Dissenyador {

    private final static Scanner DADES = new Scanner(System.in);

    private String nif;
    private String nom;
    private boolean actiu;

    /*
     TODO CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys l'atribut actiu
     Accions:
     - Assignar als atributs els valors passats com a paràmetres, menys a actiu,
     ja que quan es crea un nou dissenyador o dissenyadora, el seu estat sempre es
     actiu, per tant li assignem verdader.
     */

    public Dissenyador(String nif, String nom) {
        this.nif = nif;
        this.nom = nom;
        this.actiu = true;
    }

     /*
     TODO Mètodes accessors
     */

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isActiu() {
        return actiu;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }

    /*
    TODO
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou dissenyador o nova
    dissenyadora. Les dades a demanar són les que passem per paràmetre en el constructor.
    - També heu de tenir en compte que tant el nom pot ser una frase, per exemple,
    Francesc Xavier.
    Retorn: El nou dissenyador o nova dissenyadora creat/da.
    */

    public static Dissenyador addDissenyador() {
        System.out.println("Introduzca el NIF del disenyador");
        String nif = DADES.nextLine();
        System.out.println("Introduzca el nombre del disenyador");
        String nom = DADES.nextLine();
        boolean actiu = true;
        return new Dissenyador(nif, nom);
    }

    /*
     TODO
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - En el cas de l'atribut actiu, li heu de demanar que si el dissenyador o dissenyadora està en
     actiu introdueixi 1 i en cas contrari 0.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     En el cas de l'atribut actiu, li heu de mostrar el missatge: "\nEl dissenyador
     o dissenyadora està en actiu", si el dissenyador o dissenyadora està en actiu,
     i en cas contrari, el misaatge "\nEl dissenyador o dissenyadora no està en actiu".
     Retorn: cap
     */

    public void updateDissenyador() {
        this.showDissenyador();
        System.out.println("Introduce el nuevo NIF del disenyador:");
        String nif = DADES.next();
        System.out.println("Introduce el nuevo nombre del disenyador:");
        String nom = DADES.next();
        System.out.println("Introduce el nuevo estado del diseñador (1 = activo, 0 = inactivo):");
        String actiu = DADES.next();
        if (actiu == "1"){
            this.setActiu(true);
        } else {
            this.setActiu(false);
        }

    }

    public void showDissenyador() {
        System.out.println("\nLes dades del dissenyador o dissenyadora amb nif " + nif + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nL'estat és: ");

        if(actiu){
            System.out.print("Actiu");
        }else{
            System.out.print("No actiu");
        }
    }
}