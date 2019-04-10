package test;

import beans.Citizen;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        Citizen c1 = (Citizen) context.getBean("c1");
        Citizen c2 = (Citizen) context.getBean("c1");

        Citizen c3 = (Citizen) context.getBean("c2");
        Citizen c4 = (Citizen) context.getBean("c2");

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c3 == c4);
    }
}
