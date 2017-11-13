package ua.com.owu.run;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.owu.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/context.xml");
        System.out.printf("введи імя");
        Scanner scanner= new Scanner(System.in);
         int age = scanner.nextInt();
        String name = scanner.next();
        UserService bean = context.getBean(UserService.class);
        bean.save(name,age);

        scanner.close();
        context.close();

    }
}
