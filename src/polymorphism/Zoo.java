package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();

        sasha.makeSound();

        Cat kitty = new Cat();
       // kitty = (Cat) new Animal();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
        System.out.println(((Cat)sasha).getClass().toString());
        feed(sasha);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog) {

            System.out.println("Eat dog food");
        }else if (animal instanceof Cat){
            System.out.println("Eat cat food");
        }
    }
}
