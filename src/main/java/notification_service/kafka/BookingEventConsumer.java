package notification_service.kafka;

import notification_service.event.BookingEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BookingEventConsumer {

    @KafkaListener(topics = "booking-events", groupId = "notification-group")
    public void consume(BookingEvent event) {
        System.out.println("Received booking event: " + event.getBookingId());
    }
}


//inteview:
//If asked:
//
//        “How do services share event models?”
//
//You say:
//
//        “Each service maintains its own event contract. In real systems we can use a shared schema or schema registry.”