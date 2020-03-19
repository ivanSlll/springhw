package springhw.scanbeans;

import org.springframework.stereotype.Component;

@Component
public class Printer {

    public static void print(HelloBean hb) {
        System.out.println(hb);
    }

}
