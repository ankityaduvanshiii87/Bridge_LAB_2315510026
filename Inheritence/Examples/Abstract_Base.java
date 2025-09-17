package Inheritence.Examples;

abstract class AbstractBase {
    abstract void doTask();
}
class Impl extends AbstractBase {
    @Override
    void doTask() { System.out.println("Task performed"); }
}
public class Abstract_Base {
    public static void main(String[] args) {
        AbstractBase ab = new Impl();
        ab.doTask();
    }
}
