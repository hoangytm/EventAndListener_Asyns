package hoangytm.EventAndListener;

import org.springframework.context.ApplicationEvent;

public class DoorBellEvent extends ApplicationEvent {
    private String message;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public DoorBellEvent(Object source,String message) {
        super(source);
        this.message=message;

    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public String getMessage(){
        return message;
    }
}
