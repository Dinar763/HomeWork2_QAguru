public class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("Я говорю мяу-мяу-мяу, и мурлычу как трактор");
    }

    public Cat(String name, int age) {
        super(name, age, 300, 0);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Я не люблю плавать, давай лучше побегаем!!!!");
    }
}
