package Lesson_6.Home_Work6;
// Создание класса Животное
public class Animals {

    protected String name;
    protected int run;
    protected int swim;

    public Animals(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public void Speak() {
        System.out.println("name is  " + name);
    }

    //длина препятствия задается рандомом
    public void Run(int runLim) {
        this.run += runLim;
        System.out.println(name + "  run  " + runLim);
    }

    public void Swim(int swimLim) {
        System.out.println(name + " swim  " + swimLim);
    }

    public void Run2(int runLim) {
        if (runLim < run){
            System.out.println(name + " run " + runLim);
        }
        else { System.out.println(name + " not finish ");
        }
    }
    public void Swim2(int swimLim) {
        if (swimLim < swim ) {
            System.out.println(name + " swim " + swimLim);
        } else {
            System.out.println(name + " not finish ");
        }
    }


}



