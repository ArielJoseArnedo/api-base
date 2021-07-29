package co.com.ajac.base.events;

import io.vavr.collection.List;

public interface Listener {
    String getName();
    List<Event> onMessage(Message message, Header header);
}
