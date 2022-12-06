import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int catRand = (int) ((Math.random() * (4 - 1)) + 1);
        Animal[] arrCat = new Animal[catRand];

        int dogRand = (int) ((Math.random() * (4 - 1)) + 1);
        Animal[] arrDog = new Animal[dogRand];

        int tigRand = (int) ((Math.random() * (4 - 1)) + 1);
        Animal[] arrTig = new Animal[tigRand];


        for (int i=0; i<catRand; i++)
        {
            Cat cat = new Cat();
            arrCat[i] = cat;
        }
        for (int i=0; i<dogRand; i++)
        {
            Dog dog = new Dog();
            arrDog[i] = dog;
        }
        for (int i=0; i<tigRand; i++)
        {
            Tiger tiger = new Tiger();
            arrTig[i] = tiger;
        }

        System.out.println("Всего животных: " + (catRand+dogRand+tigRand));
        for(int i =0; i< catRand; i++)
        {
            if(i==0)
            {
                System.out.println("Котов - " + catRand);
            }

            System.out.println("Кот №" + (i+1));
            arrCat[i].run((int) (Math.random() * (1001 - 1)) +1);
            arrCat[i].swim((int) (Math.random() * (1001 - 1))+1);
        }

        for(int i =0; i< dogRand; i++)
        {
            if(i==0)
            {
                System.out.println("Собак - " + dogRand);
            }

            System.out.println("Собака №" + (i+1));
            arrDog[i].run((int) (Math.random() * (1001 - 1))+1);
            arrDog[i].swim((int) (Math.random() * (1001 - 1))+1);
        }

        for(int i =0; i< tigRand; i++)
        {
            if(i==0)
            {
                System.out.println("Тигров - " + tigRand);
            }
            System.out.println("Тигр №" + (i+1));

            arrTig[i].run((int) (Math.random() * (1001 - 1))+1);
            arrTig[i].swim((int) (Math.random() * (1001 - 1))+1);
        }

    }
}
