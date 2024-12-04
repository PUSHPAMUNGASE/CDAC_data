package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect  //Marks this class as an aspect
@Component
public class AudienceWithAroundAdvice {
	@Pointcut("execution(* example.spring.aop.Musician.perform(..))")
	private void myPointCut() {
		
	}

	private void takeSeats() {
		 System.out.println("Please, take your seats.:around");
	 }
	
	private void turnOffMobile() {
		 
		 System.out.println("Please turn off your mobile.:around");
	 }

	private void clap() {
		 System.out.println("Clap Clap Clap.:around");
	 }
	
	private void demandForRefund() {
		 System.out.println("Hey give my moeny back.:around");
	 }

	 public void leave() {
		 System.out.println("Good Bye!!.:around");
	 }
	 @Around("myPointCut()")
	 public void moniterPerformance(ProceedingJoinPoint joinPoint) {
		
		 try {
			 takeSeats();
			 turnOffMobile();
			joinPoint.proceed();//Used to proceed towards target
			clap();
		} catch (Throwable e) {
			demandForRefund();
			e.printStackTrace();
		}//used to proceed towards target
		 
		 
		 leave();
	 }

}
