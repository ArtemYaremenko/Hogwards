import java.util.Objects;

class Gryffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void comparingGryffindor(Gryffindor o) {
        if (this.nobility + this.honor + this.bravery > o.nobility + o.honor + o.bravery) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a better Gryffindor than " + o.getFirstName() + " " + o.getLastName());
        } else if (this.nobility + this.honor + this.bravery < o.nobility + o.honor + o.bravery) {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is a better Gryffindor than " + this.getFirstName() + " " + this.getLastName());
        } else {
            System.out.println(o.getFirstName() + " " + o.getLastName() + "  is a Gryffindor like " + this.getFirstName() + " " + this.getLastName());
        }
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getClass() + " {" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }
}
