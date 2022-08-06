public abstract class Animal {

    protected String name;
    protected int age;
    int runLimit;
    int swimLimit;

    public Animal(String name, int age, int runLimit, int swimLimit) {
        this.name = name;
        this.age = age;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public abstract void voice();

    public void run(int distance) {
        if (distance <= runLimit && distance > 0) {
            System.out.println(this.name + " пробежал " + distance + " м.");
        }else if (distance > runLimit) {
            System.out.println(this.name + " не сможет пробежать столько");
        }else if (distance < 0) {
            System.out.println("Я пошёл назад тогда");
        }else {
            System.out.println("Я стою на месте, жду старта");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit && distance > 0) {
            System.out.println(this.name + " проплыл " + distance + " м.");
        }else if (distance > swimLimit) {
            System.out.println(this.name + " не сможет проплыть столько");
        }else if (distance < 0) {
            System.out.println("Я плыву назад тогда");
        }else {
            System.out.println("Я просто лежу на воде, отдыхаю)) Тыкни когда нужно будет плыть");
        }
    }

    public void talkAgeAndName() {
        System.out.println("Я " + this.name +" мой возраст " + this.age);
    }


}
