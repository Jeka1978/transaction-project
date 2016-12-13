package com.credit.guard;

import com.credit.guard.controllers.TransactionDataController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 13/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("credit.guard");
        TransactionDataController controller = context.getBean(TransactionDataController.class);
        String text = "keyword=kalukabalabuka;company=IDI;card=442342342342;id=12";
        String response = controller.response(text);
        System.out.println("response = " + response);

    }
}
