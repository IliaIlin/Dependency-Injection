package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamPreparation {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

        LazyStudent lazyStudent = (LazyStudent) container.getBean("student");
        System.out.println(lazyStudent.findTheAnswer(args[0]));
    }
}
