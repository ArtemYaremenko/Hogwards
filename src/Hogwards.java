import java.util.Objects;

public class Hogwards {
    private String firstName;
    private String lastName;
    private int magicPower;
    private int transgression;

    public Hogwards(String firstName, String lastName, int magicPower, int transgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void comparingMagicPower(Hogwards o) {
        if (this.magicPower > o.magicPower) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is more powerful than " + o.getFirstName() + " " + o.getLastName());
        } else if (this.magicPower < o.magicPower) {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is more powerful than " + this.getFirstName() + " " + this.getLastName());
        } else {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is as powerful as " + this.getFirstName() + " " + this.getLastName());
        }
    }

    public void comparingTransgression(Hogwards o) {
        if (this.transgression > o.transgression) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a better transgressor than " + o.getFirstName() + " " + o.getLastName());
        } else if (this.transgression < o.transgression) {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is a better transgressor than " + this.getFirstName() + " " + this.getLastName());
        } else {
            System.out.println(o.getFirstName() + " " + o.getLastName() + " is just as transgressive as than " + this.getFirstName() + " " + this.getLastName());
        }
    }

    public static void displayStudentInfo(Hogwards o) {
        System.out.println(o.toString());
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " Hogwards {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", magicPower=" + magicPower +
                ", transgression=" + transgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwards hogwards = (Hogwards) o;
        return magicPower == hogwards.magicPower && transgression == hogwards.transgression && Objects.equals(firstName, hogwards.firstName) && Objects.equals(lastName, hogwards.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, magicPower, transgression);
    }
}
