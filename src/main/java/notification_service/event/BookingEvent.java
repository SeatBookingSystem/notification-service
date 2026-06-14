package notification_service.event;

import lombok.Getter;

@Getter
public class BookingEvent {

    private String bookingId;
    private String showId;
    private String seatId;
    private String userId;

}