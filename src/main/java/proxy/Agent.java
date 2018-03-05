package proxy;

/**
 * 与简单代理模式的区别：
 * 代理类与被代理对象继承同一个接口，代理类知道被代理类的行为，因此代理类与被代理类的结构是相同的；
 *
 * 策略模式中，策略容器与策略实现相同的接口，策略容器并不知道内部策略的详细信息。
 * 策略容器与内部策略只是简单的组合关系，容器只是将内部策略的行为抽取出来，进行了统一的实现。
 *
 * @author Test
 */
public class Agent implements Actor {
    private Star star;

    public Agent(Star star) {
        this.star = star;
    }

    public void liveShow() {
        System.out.println("notification from agent: ready for live show");
        star.liveShow();
        System.out.println("notification from agent: live show finished");
    }
}
