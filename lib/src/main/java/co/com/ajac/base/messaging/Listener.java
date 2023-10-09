package co.com.ajac.base.messaging;

import co.com.ajac.base.events.Event;
import co.com.ajac.base.events.Header;
import co.com.ajac.base.events.Message;
import io.vavr.collection.List;
import io.vavr.concurrent.Future;

public interface Listener {
    String getName();
    Future<List<Event>> onMessage(Message message, Header header);
}
