package model;

public abstract class Animal {

private String name;
private String type;
private String clas;
private String family;
private String squad;
private double weight;

    public Animal(String name, String type, String clas, String family, String squad, double weight) {
        this.name = name;
        this.type = type;
        this.clas = clas;
        this.family = family;
        this.squad = squad;
        this.weight = weight;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal(){}


    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public double getWeight() {
        return weight;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }

    public abstract String eat();
    public String voice(){
        return " Voice";

    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", clas='" + clas + '\'' +
                ", family='" + family + '\'' +
                ", squad='" + squad + '\'' +
                ", weight=" + weight +
                '}';
    }
}
