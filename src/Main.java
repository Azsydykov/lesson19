import model.*;

public class Main {

    public static void main(String[] args) {

        Tiger sherhan = new Tiger("Шерхан","тигр","млекопитающий","кошачьи","хищные", 300);
        Tiger sher = new Tiger("Шер","тигр","млекопитающий","кошачьи","хищные", 300);

        Wolf akuya = new Wolf("Акуя","волк","млекопитающий","собачьи","хищные", 65);
        Wolf soka = new Wolf("Сока","волк","млекопитающий","собачьи","хищные", 55);

        Gorilla kong = new Gorilla("Конг","горилла","млекопитающий","приматы","травоядная", 345);
        Gorilla king = new Gorilla("Кинг","горилла","млекопитающий","приматы","травоядная", 315);

        Elephant sofia = new Elephant("София","слон","млекопитающий","слоновые","хоботные", 4600, false);
        Elephant boris = new Elephant("Борис","слон","млекопитающий","слоновые","хоботные", 5000, true);


        Animal[] animals = {sherhan,sher,akuya,soka,kong,king,sofia,boris};
        for(Animal item: animals){
            System.out.println(item);

        }
        Animal[] animalsVoice = {sher,akuya,kong,boris};
        for (Animal item : animalsVoice){
            System.out.println(item.voice());
        }

        Animal[] animalsEat = {sher,akuya,kong,boris};
        for (Animal item : animalsEat){
            System.out.println(item.eat());
        }



    }

}


