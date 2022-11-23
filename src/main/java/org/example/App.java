package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Car car = new Car();
//        car.drive();

//        Vehicle obj = new Car();
//        obj.drive();

//        Vehicle obj = getBean("Vehicle");  ==> asking just to give me a vehicle.
//        this can be achieved by 2 ways 1.BeanFactory 2.ApplicationContext
//        applicationcontext is superset of beanfactory, if its small project go with beanfactory else go with applicationcontext
//        obj.drive();

        // Configuration is done in 1.XML Configuration 2.Annotations 3.Java Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


        Vehicle obj1 = (Vehicle) context.getBean("car");
        obj1.drive();

        Vehicle obj2 = (Vehicle) context.getBean("bike");
        obj2.drive();

        Tyre tyre = (Tyre) context.getBean("tyre");
        System.out.println(tyre);

    }
}
