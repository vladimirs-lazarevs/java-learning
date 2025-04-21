package lv.acodemy;

public class Playground {
    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setAge(1);
        rex.bark();
        rex.feed();

        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        Dog barsik = new Dog("Alabai");
        barsik.setName("Barsik");
        barsik.setAge(1);

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        System.out.println(barsik.getBreedName());

        Dog gav = new Dog("Gav",2,"Haski");
        System.out.println(gav);

Car dodge = new Car("Dodge");
        System.out.println(dodge);
        dodge.drive();
        dodge.refuel();
        dodge.service();
        dodge.showStatus();





    }

}
