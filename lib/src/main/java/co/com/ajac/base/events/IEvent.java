package co.com.ajac.base.events;

import io.vavr.control.Option;

public interface IEvent<H extends IHeader, M extends IMessage, N extends INotice> {
    H getHeader();
    M getMessage();
    default Option<N> getNotice() {
        return Option.none();
    }
}
