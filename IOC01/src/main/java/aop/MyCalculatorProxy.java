package aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class MyCalculatorProxy {
    public static Object getInstance(final MyCalculatorImpl myCalculatorImpl){
        return Proxy.newProxyInstance(MyCalculatorProxy.class.getClassLoader(), myCalculatorImpl.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.print(method.getName()+"方法开始执行了");

                Object invoke = method.invoke(myCalculatorImpl, args);
                System.out.print(method.getName()+"方法执行完成了");
                return invoke;
            }
        });
    }

}
