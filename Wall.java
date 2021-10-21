package JavaCore.lesson1.hw1;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Human human) {
        human.jump(height);
    }
}