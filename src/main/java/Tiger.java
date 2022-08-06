public class Tiger extends Animal{


    @Override
    public void voice() {
        System.out.println("Я говорю РРРРРРРРР");
    }

    Tiger(String name, int age) {
        super(name, age, 1000, 50);
    }
}
