package co.com.ajac.base.messaging;

import co.com.ajac.base.events.IEvent;
import io.vavr.collection.List;
import io.vavr.concurrent.Future;

public interface Publisher {
    Future<List<IEvent>> publish(List<IEvent> events);
}
