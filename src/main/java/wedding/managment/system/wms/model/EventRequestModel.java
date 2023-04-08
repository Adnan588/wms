package wedding.managment.system.wms.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import wedding.managment.system.wms.Entity.EventRequest;

@Data
@NoArgsConstructor
public class EventRequestModel{

    private int id;
    private String eventType;
    private int numOfGuest;
    private String date;
    private String day;
    private String time;
    private UserModel userId;
    private String status;

    public EventRequestModel(EventRequest eventRequest)
    {
        this.id = eventRequest.getId();
        this.eventType = eventRequest.getEventType();
        this.numOfGuest = eventRequest.getNumOfGuest();
        this.date = eventRequest.getDate();
        this.day = eventRequest.getDay();
        this.time = eventRequest.getTime();
        this.status = eventRequest.getStatus();
    }


}
