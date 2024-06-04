public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 60, 40, 60, 70, 80);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 50, 40, 60, 50, 60);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 50, 20, 50, 80, 60);

        ronWeasley.comparingGryffindor(hermioneGranger);
        Hogwards.displayStudentInfo(harryPotter);
    }
}
