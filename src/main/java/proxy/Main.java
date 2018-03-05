package proxy;

import java.lang.reflect.Proxy;

/**
 * @author Test
 */
public class Main {

    public static void main(String[] args) {
        Agent agent = new Agent(new Star());
        agent.liveShow();

        Class<Actor> targetClass = Actor.class;
        Actor star = (Actor) Proxy.newProxyInstance(targetClass.getClassLoader(),
                new Class[]{targetClass},
                new DynamicProxy(new Star()));
        star.liveShow();


        Star s = new CGLibProxy().getProxy(Star.class);
        s.liveShow();
    }
}
