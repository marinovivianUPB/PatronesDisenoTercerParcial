package patronesdisenotercerparcial.templates.adapter;

public class ConcreteObject2 implements IAdapter{
    @Override
    public void method1() {
        System.out.println("ConcreteObject2>method1 ");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteObject2>method12 ");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteObject2>method3 ");
    }

    @Override
    public void operation() {
        System.out.println("ConcreteObject2>operation ");
    }
}
