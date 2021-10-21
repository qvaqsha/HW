package JavaCore.lesson1.hw1;

public class Course {
    private Obstacle[] course = {new Cross(3), new Wall(33),new Cross(3)};

    public void doIt(Team team){
        for (Human human : team.getCompetitors()){
            for(Obstacle o: course){
                o.doIt(human);
            }
        }
    }

}
