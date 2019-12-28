package hoangytm.EventAndListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyHouse {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void rangDoorbellBy(String guestName) {
        Number number=new Number("hello");
            applicationEventPublisher.publishEvent(new DoorBellEvent(number, guestName));
    }
}

