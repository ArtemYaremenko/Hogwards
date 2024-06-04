import java.util.Objects;

public class Slytherin extends Hogwards {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(String firstName, String lastName, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, lastName, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void comparingSlytherin(Slytherin o) {
        if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower > o.cunning + o.determination + o.ambition + o.resourcefulness + o.thirstForPower) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a better Ravenclaw than " + o.getFirstName() + " " + o.getLastName());
        } else if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower < o.cunning + o.determination + o.ambition + o.resourcefulness + o.thirstForPower) {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is a better Ravenclaw than " + this.getFirstName() + " " + this.getLastName());
        } else {
            System.out.println(o.getFirstName() + " " + o.getLastName() + "  is a Ravenclaw like " + this.getFirstName() + " " + this.getLastName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getClass() + " {" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgression=" + this.getTransgression() +
                ", nobility=" + cunning +
                ", honor=" + determination +
                ", bravery=" + ambition +
                ", creativity=" + resourcefulness +
                ", thirst for power=" + thirstForPower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }
}
