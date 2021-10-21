package JavaCore.lesson1.hw1;

public class Main {
    public static void main (String[] args) {
        Human h = new Human("oleg",3,43);
        Human hh = new Human("olga",3,5);
        Human[] humans = new Human[]{h, hh};
        Team team1 = new Team("fst", humans);
        Course course = new Course();
        course.doIt(team1);
        team1.showResults();
    }
}