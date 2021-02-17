package exercise3;

public class Solido {
  int altezza, larghezza, profondita;

  public Solido() {
    this.altezza = 12;
    this.larghezza = 5;
    this.profondita = 10;
  }
  
  public Solido(int altezza, int larghezza, int profondita) {
    this.altezza = altezza;
    this.larghezza = larghezza;
    this.profondita = profondita;
  }

  public String dettagli(){
      String d = 
      "Il solido è alto " + this.altezza + "cm, largo "  + this.larghezza + "cm e profondo " + this.profondita + "cm.";
      return d;
  }

  public int calcolovolume(){
    int volume = (this.altezza) * (this.larghezza) * (this.profondita);
    return volume;
  }

  public boolean equals(Solido other){
    this.altezza = altezza;
    this.larghezza = larghezza;
    this.profondita = profondita;
    return this.altezza == other.altezza && this.larghezza == other.larghezza && this.profondita == other.profondita;
  }

}

