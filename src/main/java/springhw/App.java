package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans.HelloBean;
import springhw.beans.Printer;

public class App {

	public static void main(String[] args) {
        // Создаем контекст приложения из xml файла("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Считываем бин (объект)
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        Printer printer = ctx.getBean("printerBean", Printer.class);
        // Печатаем объект в консоль
        System.out.println(hb);
        printer.print(hb);
        // Закрываем контекст приложения
        ctx.close();
	}

}
