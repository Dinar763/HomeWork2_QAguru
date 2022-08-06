public class TestClass {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигра", 7);
        Dog dog =new Dog("Барсик", 5);
        Cat cat = new Cat("Мурка", 3);

        tiger.talkAgeAndName();
        tiger.voice();
        tiger.swim(20);
        tiger.run(550);
        dog.talkAgeAndName();
        dog.voice();
        dog.swim(10);
        dog.run(60);
        cat.talkAgeAndName();
        cat.voice();
        cat.swim(40);
        cat.run(60);

    }
}
