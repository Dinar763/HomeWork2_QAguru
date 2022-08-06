public class Dog extends Animal{

    @Override
    public void voice() {
        System.out.println("Я говорю гав-гав-гав");
    }

    public Dog(String name, int age) {
        super(name, age, 500, 50);
    }
}
