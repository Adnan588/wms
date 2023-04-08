package wedding.managment.system.wms.Contrller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wedding.managment.system.wms.Entity.EventRequest;
import wedding.managment.system.wms.model.EventRequestModel;
import wedding.managment.system.wms.service.EventRequestService;
import java.util.List;
@RestController
public class EventRequestController {
    @Autowired
    EventRequestService eventRequestService;

    @PostMapping("/event-request")
    private String saveEventRequest(@RequestBody EventRequestModel eventRequestModel) throws Exception{
        return eventRequestService.saveOrUpdate(eventRequestModel);
    }

    @GetMapping("/eventrequest")
    public List<EventRequest> findAllEventRequest() {
        return eventRequestService.getEventRequest();
    }

    @GetMapping("/eventrequest/{id}")
    public EventRequest findeventrequestById(@PathVariable int eventId) {
        return eventRequestService.getEventRequestById(eventId);
    }

    @DeleteMapping("delete/{id}")
    public String deleteEventRequest(@PathVariable("id ") int eventId) {
        return eventRequestService.deleteEventRequest(eventId);
    }

    @GetMapping("event(id)")
    public EventRequest findEventRequestById(@PathVariable int eventrequestId) {
        return eventRequestService.getEventRequestById(eventrequestId);

    }

}

