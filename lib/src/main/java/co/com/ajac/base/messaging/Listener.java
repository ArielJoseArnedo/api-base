package co.com.ajac.base.messaging;

import co.com.ajac.base.events.IEvent;
import co.com.ajac.base.events.IHeader;
import co.com.ajac.base.events.IMessage;
import io.vavr.collection.List;
import io.vavr.concurrent.Future;

public interface Listener {
    String getName();
    default Future<List<IEvent>> onMessage(IMessage IMessage, IHeader IHeader) {
        return Future.successful(List.empty());
    }
}
