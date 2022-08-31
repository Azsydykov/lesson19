package model;

import interfaces.Protecting;

public class Gorilla extends Animal implements Protecting {


    public Gorilla(String name, String type, String clas, String family, String squad, double weight) {
        super(name, type, clas, family, squad, weight);
    }

    public Gorilla() {
    }

    @Override
    public String eat() {
        return "Горилла кушает";
    }

    @Override
    public String voice() {
        return "УУ-уу";
    }

    @Override
    public String protect() {
        return "Горилла защищает семью";
    }
}
