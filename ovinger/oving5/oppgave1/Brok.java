package ovinger.oving5.oppgave1;

public class Brok {

    private int teller;
    private int nevner;

    //konstruktør som tar både Teller og Nevner
    Brok(int teller, int nevner) {
        if(nevner == 0) {
            System.out.println("Never kan ikke være 0");
        } else {
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    // konstruktår som bare tar Teller og setter nevner lik 1
    Brok(int teller) {
        this.teller = teller;
        this.nevner = 1;

    }

    //metode for å hente teller fra brøk
    public int getTeller() {
        return this.teller;
    }

    //metode for å hente nevner av brøk
    public int getNevner() {
        return this.nevner;
    }

    //metode for å displaye brøk.
    public String displayBrok() {
        return this.teller + "/" + this.nevner;
    }

    // metode for pluss
    public void summer(Brok annen) {
        System.out.println(this.teller + "/" + this.nevner + " + " + annen.displayBrok());
        this.teller =  this.teller * annen.getNevner() + annen.getTeller() * this.nevner;
        this.nevner = this.nevner * annen.getNevner();
    }

    // metode for minus
    public void subtraher(Brok annen) {
        System.out.println(this.teller + "/" + this.nevner + " - " + annen.displayBrok());
        this.teller =  this.teller * annen.getNevner() - annen.getTeller() * this.nevner;
        this.nevner = this.nevner * annen.getNevner();
    }

    //metode for å gange brøker
    public void multipliser(Brok annen) {
        System.out.println(this.teller + "/" + this.nevner + " * " + annen.displayBrok());
        this.teller = this.teller * annen.getTeller();
        this.nevner = this.nevner * annen.getNevner();
    }

    // metode for å dele brøker
    public void divider(Brok annen) {
        System.out.println(this.teller + "/" + this.nevner + " / " + annen.displayBrok());

        this.teller = this.teller * annen.getNevner();
        this.nevner = this.nevner * annen.getTeller();
    }
}
