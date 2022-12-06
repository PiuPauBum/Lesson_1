public class Cat extends Animal{
    private String name;
    private final int RESTR = 200;
    private final int RESTS = 0;


    @Override
    void run(int pathLength) {
        if (pathLength < RESTR)
        {
            System.out.println("Пробежал " + pathLength + "м");
        }
        else if (pathLength<0)
        {
            System.out.println("Дистанция не может быть отрицательной");
        }
        else {
            System.out.println("Не смог пробежать " + pathLength + "м");
        }
    }

    @Override
    void swim(int pathLength) {
        if (pathLength > 0)
        {
            System.out.println("Не смог проплыть " + pathLength + "м, так как не умеет плавать");
        }
        else if (pathLength<0)
        {
            System.out.println("Дистанция не может быть отрицательной");
        }
    }
}
