package tn.esprit.arctic8.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Slf4j
@Component
@Aspect
public class ProjectAOP {//aspect
    //@Before("execution(* tn.esprit.arctic8.*.IUserService.add*(..))")   // .. 0 ou plusieur parametres
    //@AfterThrowing("execution(* tn.esprit.arctic8.*.IUserService.*(..))") //@AfterThrowing => type d'advice
    //@AfterReturning("execution(* tn.esprit.arctic8.*.IUserService.*(..))") //joinpoint  pattern la methode visé (* tn.esprit.arctic8.*.IUserService.*(..))" cutpoint
    void journaliser(){
        log.info("test");
    }
    @Around("execution(* tn.esprit.arctic8.service.*.*(..))")
    Object calculateExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        LocalDateTime debut=LocalDateTime.now();
        Object obj=pjp.proceed();
        LocalDateTime fin=LocalDateTime.now();
        long tempsExec=Duration.between(fin, debut).toMillis();
        log.info("le temps d'execution de la methode :"+ pjp.getSignature().getName()+"est"+tempsExec+"ms");
        return obj;
    }

}
