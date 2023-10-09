package co.com.ajac.base.messaging;

import co.com.ajac.base.events.Event;
import io.vavr.collection.List;
import io.vavr.concurrent.Future;

public interface Publisher {
    Future<List<Event>> publish(List<Event> events);
}
