package aspect;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Logger class created in order to monitor REST JPA behavior.
 * 
 * There are three methods:
 * 		one to log the start of the RestJPA method,
 * 		one to log the end of method execution,
 * 		and one to measure execution time.
 * 
 * Based of logs, user can validate performance of REST service, and correctness of the execution.
 * 
 * @see		RestJPA
 */
@Aspect
public class LoggerAspect {
	  @Pointcut("execution(* api.RestJPA.*.*(..))")
	  private void restJPAQueries() {
	  }
	  
	  @Before("restJPAQueries()")
	  public void logBefore(JoinPoint joinPoint)  {
		  System.out.println("*** Wykonanie metody " + joinPoint.getSignature().getName() + "...");
	  }
	  
	  @AfterReturning(pointcut = "restJPAQueries()", returning = "retVal")
	  public void afterReturningMethod(JoinPoint joinPoint, Object retVal) {
	      System.out.println("*** Metoda " + joinPoint.getSignature().getName() + " zwróciła wartość : " + retVal.toString());
	  }
  
	  @Around("restJPAQueries()")
	  public Object measureMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
	      long start = System.nanoTime();
	      Object retval = pjp.proceed();
	      long end = System.nanoTime();
	      System.out.print("*** Czas wykonania " + pjp.getSignature().getName() + " wynosi " + 
	             TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
	      return retval;
	  }
}