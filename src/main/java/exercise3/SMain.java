package exercise3;

public class SMain {
    public static void main(String[] args) {
      Solido solido1 = new Solido(15, 20, 25);
      Solido solido2 = new Solido(30, 35, 40);
      Solido solido3 = new Solido(45, 50, 55);

      System.out.println(solido1.calcolovolume() == solido2.calcolovolume());

      /**
      if((solido1.dettagli()).equals(solido2.dettagli())){
        System.out.println("I primi due solidi sono uguali");
      } else {
        System.out.println("I primi due solidi sono diversi");
      }
      */
      
      System.out.println("Dettagli solido 1: " + solido1.dettagli());
      System.out.println("Dettagli solido 2: " + solido2.dettagli());
      System.out.println("Dettagli solido 3: " + solido3.dettagli());

      System.out.println("Volume solido 1: " + solido1.calcolovolume() + "cm3");
      System.out.println("Volume solido 2: " + solido2.calcolovolume() + "cm3");
      System.out.println("Volume solido 3: " + solido3.calcolovolume() + "cm3");

    }
}
    

      