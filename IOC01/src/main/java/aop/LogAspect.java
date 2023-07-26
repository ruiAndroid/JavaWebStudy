package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect //表示这是一个切面
public class LogAspect {

    /**
     * 可以统一定义切点
     * 第一个*:要拦截的方法返回值是任意类型
     * 第二个*:表示包中的任意类，也可以明确指定类
     * 第三个*:表示类中的任意方法
     *最后两个点表示方法参数任意，个数任意，类型任意
     *
     */
    @Pointcut("execution(* aop.*.*(..))")
    public void pointCut(){

    }


    /**
     * 前置通知 在目标方法执行前执行
     * @param joinPoint
     */
    @Before(value="pointCut()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.print(name+"方法开始执行了");

    }


    /**
     * 后置通知 在目标方法执行后执行
     */
    @After(value="pointCut()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.print(name+"方法执行结束了");

    }

    /**
     * 返回通知
     * r 返回的参数名称 参数类型要匹配
     */
    @AfterReturning(value="pointCut()",returning = "r")
    public void returning(JoinPoint joinPoint,Object r){
        String name = joinPoint.getSignature().getName();
        System.out.print(name+"方法的返回通知 r:"+r);


    }

    /**
     * 异常通知
     * 当该方法抛出异常时才会触发
     * e 异常类型 异常类型需要匹配
     */
    @AfterThrowing(value="pointCut()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.print(name+"方法的异常通知 e:"+e.getMessage());

    }

    /**
     * 环绕通知时集大成者，可以通过环绕通知实现上面4个通知
     * 返回值最好是Object 和拦截到的方法匹配
     */
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            return proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }


}
