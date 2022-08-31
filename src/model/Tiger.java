package model;

import interfaces.Hunting;
import interfaces.Running;

public class Tiger extends Animal implements Hunting, Running {

    public Tiger(String name, String type, String clas, String family, String squad, double weight) {
        super(name, type, clas, family, squad, weight);
    }

    public Tiger() {
    }

    @Override
    public String eat() {
        return "Тигр кушает";
    }

    @Override
    public String voice() {
        return "Рычание тигра";
    }

    @Override
    public String hunt() {
        return "Тигр охотится";
    }

    @Override
    public String run() {
        return "Тигр бежит";

    }
}
