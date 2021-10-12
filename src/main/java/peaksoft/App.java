package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person myPerson = context.getBean("myPerson", Person.class);
        System.out.println(myPerson.toString());
        Lion lion = context.getBean("hisAnimal", Lion.class);
        lion.animalMinus();
        lion.animalPlus();


        Person mine = context.getBean("me", Person.class);
        System.out.println(mine.toString());
        Bird bird = context.getBean("myAnimal", Bird.class);
        bird.animalMinus();
        bird.animalPlus();

        context.close();
    }

}
