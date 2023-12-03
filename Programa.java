abstract class Ator {

  public abstract void ato();

}

class AtorFeliz extends Ator {

  public void ato() {

    System.out.println("Ator feliz");

  }

}

class AtorTriste extends Ator {

  public void ato() {

    System.out.println("Ator triste");

  }

}

class Palco {

  private Ator ator = new AtorFeliz();

  public void altera() { ator = new AtorTriste(); }

  public void atuar() { ator.ato(); }

}

public class Programa {

  public static void main(String[] args) {

    Palco palco = new Palco();

    palco.atuar();

    palco.altera();

    palco.atuar();

  }

}
