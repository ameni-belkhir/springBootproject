package tn.esprit.arctic8.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Slf4j //activer le service log de Lombok
@AllArgsConstructor
@Service
public class NotificationServiceImpl {

    // fixedRate cadence fixe en ms 1000==1s  , fixedDelay prendre en consideration la finn de la tâche précédentanes 5s+tempsd'exec, CRON contien 6 variables (s(0-59)m(0-59)h(0-23)j(0-31)m(0-12)jourdelasemaine(0-7/mon-sun))//j/m le 0 le dernier jours du mois
    @Scheduled(fixedRate = 5000 ) // chron */1 : chaque seconde ,, 1 la premiere s de chaque min
    void testscheduler(){
        System.out.println("Test Scheduler");
        log.info("test scheduler");
    }
}
