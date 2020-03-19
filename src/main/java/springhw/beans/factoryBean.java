package springhw.beans;

public class factoryBean {

    public Printer createPrint() {
        return new Printer();
    }

    public HelloBean createBean(String name) {
        return new HelloBean(name);
    }
}
