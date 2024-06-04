public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 60, 40, 60, 70, 80);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 50, 40, 60, 50, 60);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 50, 20, 50, 80, 60);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 34, 67, 63, 56, 98, 80, 90);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 45, 56, 32, 74, 66, 57, 44);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 46, 75, 23, 56, 72, 56, 65);

        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah", "Smith", 67, 55, 75, 47, 89);
        Hufflepuff cedrickDiggory = new Hufflepuff("Cedrick", "Diggory", 44, 78, 56, 89, 75);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 45, 32, 67, 58, 74);

        Ravenclaw zhouChang = new Ravenclaw("Zhou", "Chang", 65, 45, 78, 54, 70, 52);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 54, 60, 65, 78, 66, 81);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 57, 70, 49, 60, 61, 77);

        ronWeasley.comparingGryffindor(hermioneGranger);
        dracoMalfoy.comparingMagicPower(harryPotter);
        zhouChang.comparingRavenclaw(marcusBelby);

        Hogwards.displayStudentInfo(harryPotter);
        Hogwards.displayStudentInfo(gregoryGoyle);
        Hogwards.displayStudentInfo(zachariahSmith);
        Hogwards.displayStudentInfo(padmaPatil);
    }
}
