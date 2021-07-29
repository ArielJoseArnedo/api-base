package co.com.ajac.base.events;

import io.vavr.collection.List;

public interface Publisher {
    List<Event> publish(List<Event> events);
}
