public class Dog extends Animal {
    private String name;
    private final int RESTR = 500;
    private final int RESTS = 10;

    @Override
    void run(int pathLength) {
        if (pathLength < RESTR)
        {
            System.out.println("Пробежала " + pathLength + "м");
        }
        else if (pathLength<0)
        {
            System.out.println("Дистанция не может быть отрицательной");
        }
        else {
            System.out.println("Не смогла пробежать " + pathLength + "м");
        }
    }

    @Override
    void swim(int pathLength) {
        if (pathLength < RESTS)
        {
            System.out.println("Проплыла " + pathLength + "м");
        }
        else if (pathLength<0)
        {
            System.out.println("Дистанция не может быть отрицательной");
        }
        else
        {
            System.out.println("Не смогла проплыть " + pathLength + "м");
        }
    }
}
