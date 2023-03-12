package practice;

public class Child extends Parent<PassChild>{

    public Child() {
        inst = new PassChild();
    }

    public void abc() {
        inst.call();
    }
}
