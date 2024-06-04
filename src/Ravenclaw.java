import java.util.Objects;

public class Ravenclaw extends Hogwards {
    int smart;
    int wise;
    int witty;
    int creativity;

    public Ravenclaw(String firstName, String lastName, int magicPower, int transgression, int smart, int wise, int witty, int creativity) {
        super(firstName, lastName, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public void comparingRavenclaw(Ravenclaw o) {
        if (this.smart + this.wise + this.witty + this.creativity > o.smart + o.wise + o.witty + o.creativity) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a better Ravenclaw than " + o.getFirstName() + " " + o.getLastName());
        } else if (this.smart + this.wise + this.witty + this.creativity < o.smart + o.wise + o.witty + o.creativity) {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is a better Ravenclaw than " + this.getFirstName() + " " + this.getLastName());
        } else {
            System.out.println(o.getFirstName() + " " + o.getLastName() + "  is a Ravenclaw like " + this.getFirstName() + " " + this.getLastName());
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getClass() + " {" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", nobility=" + smart +
                ", honor=" + wise +
                ", bravery=" + witty +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return smart == ravenclaw.smart && wise == ravenclaw.wise && witty == ravenclaw.witty && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty, creativity);
    }
}
