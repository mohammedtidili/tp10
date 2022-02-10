package cigma.pfe.application;

import cigma.pfe.application.controller.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demarrage {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("inheritance.xml");
        //ClientController clientController = (ClientController) applicationContext.getBean("clientCtr");

    }

}
