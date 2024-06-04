import java.util.Objects;

public class Hufflepuff extends Hogwards {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int magicPower, int transgression, int diligence, int loyalty, int honesty) {
        super(firstName, lastName, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void comparingHufflepuff(Hufflepuff o) {
        if (this.diligence + this.loyalty + this.honesty > o.diligence + o.loyalty + o.honesty) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a better Hufflepuff than " + o.getFirstName() + " " + o.getLastName());
        } else if (this.diligence + this.loyalty + this.honesty < o.diligence + o.loyalty + o.honesty) {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is a better Hufflepuff than " + this.getFirstName() + " " + this.getLastName());
        } else {
            System.out.println(o.getFirstName() + " " + o.getLastName() + "  is a Hufflepuff like " + this.getFirstName() + " " + this.getLastName());
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getClass() + " {" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", nobility=" + diligence +
                ", honor=" + loyalty +
                ", bravery=" + honesty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diligence, loyalty, honesty);
    }
}
