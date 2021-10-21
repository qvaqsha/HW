package JavaCore.lesson1.hw1;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Human human) {
        human.run(distance);
    }
}
