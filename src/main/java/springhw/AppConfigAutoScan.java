package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.scanbeans.HelloBean;
import springhw.scanbeans.Printer;

public class AppConfigAutoScan {

    public static void main(String[] args) {
        // Создаём конекст приложения из xml файла ("src/main/resources/applicationAutoScanContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationAutoScanContext.xml");
        // Считываем бин (объект)
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        Printer printer = ctx.getBean("printerBean", Printer.class);
        // Печатаем объект в консоль
        printer.print(hb);
        // Закрываем контекст приложения
        ctx.close();
    }

}
