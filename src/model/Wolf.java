package model;

import interfaces.Hunting;
import interfaces.Running;

public class Wolf extends Animal implements Hunting, Running {

    public Wolf(String name, String type, String clas, String family, String squad, double weight) {
        super(name, type, clas, family, squad, weight);
    }


    public Wolf() {
    }

    @Override
    public String eat() {
        return "Волк кушает";
    }

    @Override
    public String voice() {
        return "Вой волка";
    }

    @Override
    public String hunt() {
        return "Волк на охоте";
    }

    @Override
    public String run() {
        return "Волк бежит";
    }
}
