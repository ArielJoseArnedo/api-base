package co.com.ajac.domain.events;

import io.vavr.collection.List;

public interface Publisher {
    List<Event> publish(List<Event> events);
}
