package JavaCore.lesson1.hw1;

import java.util.Arrays;

public class Team {
    private String name;
    Human[] competitors;

    public Team(String name, Human[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human[] getCompetitors() {
        return competitors;
    }
    public String getInfoAll(){
        return name + competitors;
    }
    public void setCompetitors(Human[] competitors) {
        this.competitors = competitors;
    }
    public void showResults(){
        for (Human human : competitors){
            System.out.println(human.getResult());
        }
    }
}
