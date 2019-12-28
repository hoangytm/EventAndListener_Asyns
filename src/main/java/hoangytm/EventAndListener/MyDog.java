package hoangytm.EventAndListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyDog implements ApplicationListener<DoorBellEvent> {


    @Async
    @Override
    public void onApplicationEvent(DoorBellEvent event) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Number number = (Number) event.getSource();
        System.out.println(number.getIntNumber());
        System.out.println("Wof,Wof");
    }
}
