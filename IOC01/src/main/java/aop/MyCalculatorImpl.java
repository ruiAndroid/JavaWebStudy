package aop;


import org.springframework.stereotype.Component;

@Component
public class MyCalculatorImpl implements MyCalculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public void min(int a, int b) {
        System.out.print("min a-b:"+(a-b));
    }
}
