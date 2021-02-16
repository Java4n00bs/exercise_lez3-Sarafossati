package exercise1;


public class Impiegato {

  String nome, cognome;
  int salario;

  public Impiegato() {
    this.nome = "";
    this.cognome = "";
    this.salario = 1800;
  }

  public Impiegato(String nome, String cognome, int salario) {
    this.nome = nome;
    this.cognome = cognome;
    this.salario = salario;
  }

    public String dettagli(){
        //qui il corpo
        String d = 
      "La Persona si chiama " + this.nome + " " + this.cognome + " e guadagna " + this.salario + " euro al mese.";
      return d;
    }

    public void aumentaSalario(int percentuale){

      this.salario = this.salario + (this.salario/100 * percentuale);
    }

    

}