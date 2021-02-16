package exercise1;

public class IMain {
    public static void main(String[] args) {
      Impiegato impiegato1 = new Impiegato("Sara", "Fossati", 25);
      Impiegato impiegato2 = new Impiegato("Mario", "Rossi", 12);

      impiegato1.aumentaSalario(10);


    if (impiegato1.salario > impiegato2.salario){
      System.out.println("Il salario maggiore è quello di Sara");
    } else {
      System.out.println("Il salario maggiore è quello di Mario");
    }

    System.out.println("Mario guadagna " + impiegato2.salario + " euro al mese");
    System.out.println("Sara guadagna " + impiegato1.salario + " euro al mese");
    System.out.println(impiegato1.dettagli());
    }
}

/**
 * Come compilare dei sorgenti che utilizzano classi dello stesso package?
 *
 *  1)  mi posiziono nella cartellla che CONTIENE il package,
 *      in questo caso dentro la cartella /java.
 *  2)  compilo tutto il package, usando:  javac /<nomedelpackage>/*.java
 *  3)  se non ci sono errori di compilazione, posso eseguire
 *      la mia classe Main, ma nel formato <nomedelpackage>/Main,
 *      ovvero preceduta dal nome del suo stesso package.
 *
 */
