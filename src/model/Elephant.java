package model;

import interfaces.Protecting;

public class Elephant extends Animal implements Protecting {
    private boolean hasTusks;

    public boolean isHasTusks() {
        return hasTusks;
    }

    public void setHasTusks(boolean hasTusks) {
        this.hasTusks = hasTusks;
    }

    public Elephant(String name, String type, String clas, String family, String squad, double weight, boolean hasTusks) {
        super(name, type, clas, family, squad, weight);
        this.hasTusks = hasTusks;
    }

    public Elephant(boolean hasTusks) {
        this.hasTusks = hasTusks;
    }

    @Override
    public String eat() {
        return "Слон кушает";
    }

    @Override
    public String voice() {
        return "ПФФФ-ПФФФ";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                " type='" + getType() + '\'' +
                ", clas='" + getClas() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", squad='" + getSquad() + '\'' +
                ", avarageWeight=" + getWeight() +
                ", hasTusks=" + hasTusks +
                '}';
    }

    @Override
    public String protect() {
        return "Слон захищает детёныша";
    }
}
