package sk.itsovy.kutka.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.kutka.aopdemo.dao.AccountDAO;

public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount();

        System.out.println("again");

        accountDAO.addAccount();

        context.close();
    }
}
