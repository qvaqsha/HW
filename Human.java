package JavaCore.lesson1.hw1;

import java.util.Objects;

public class Human {
    private String name;
    private int maxRun;
    private int maxJump;
    boolean isActive = true;

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run(int length){
        if ((length <= maxRun)&&(isActive==true)){
            System.out.println(name + " Бежит");
        } else{
            isActive = false;
        }
    }
    public String getFullInfo(){
        return name + maxJump + maxRun;
    }
    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void jump(int height){
        if ((height <= maxJump)&&(isActive==true)){
            System.out.println(name + " Прыгает");
        } else{
            isActive = false;
        }
    }
    public String getResult(){
        return "Участник " + name + (isActive ? " Прошёл испытание" : " Сошёл с дистанции");
    }
}
