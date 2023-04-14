package wedding.managment.system.wms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wedding.managment.system.wms.Entity.EventRequest;
import wedding.managment.system.wms.Entity.User;
import wedding.managment.system.wms.Repository.EventRepository;
import wedding.managment.system.wms.Repository.UserRepository;
import wedding.managment.system.wms.model.EventRequestModel;
import java.util.Date;
import java.util.List;
@Service
public class EventRequestService {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    UserRepository userRepository;
    public String saveOrUpdate(EventRequestModel eventRequestmodel)throws Exception {
        if(!searchEventRequest(eventRequestmodel.getDate())){
            EventRequest    eventRequest  = eventRepository.findById(eventRequestmodel.getId()).orElse(new EventRequest());
            eventRequest.setDay(eventRequestmodel.getDay());
            eventRequest.setTime(eventRequestmodel.getTime());
            eventRequest.setDate(eventRequestmodel.getDate());
            eventRequest.setEventType(eventRequestmodel.getEventType());
            eventRequest.setStatus(eventRequestmodel.getStatus());
            eventRequest.setNumOfGuest(eventRequestmodel.getNumOfGuest());
            User user =  userRepository.findById(eventRequestmodel.getUserId().getUserId()).orElseThrow( () -> new Exception("User not found - " + eventRequestmodel.getUserId().getUserId()));
            eventRequest.setUser(user);
            eventRepository.save(eventRequest);
            return "Success";
        }else {
            return "Date already reserved";
        }
    }

    public List<EventRequest> getEventRequest(){
        return eventRepository.findAll();
    }
    public EventRequest getEventRequestById(int eventId){
        return eventRepository.findById(eventId).get();
    }

    public String deleteEventRequest(int eventId){
        eventRepository.deleteById(eventId);
        return "event remove";
    }

    public EventRequest updateEventRequest(EventRequest eventRequest){
        return eventRepository.save(eventRequest);
    }
   private Boolean searchEventRequest(Date date){
        Boolean result;
        if (eventRepository.findEventRequestByDate(date)!=null){
            result=true;
        }
        else{
            result=false;
        }
        return  result;
    }
}
