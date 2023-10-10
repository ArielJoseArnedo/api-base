package co.com.ajac.base.events;

import io.vavr.control.Option;

public interface Event {
    Header getHeader();
    Message getMessage();

    default Option<Notice> getNotice() {
        return Option.none();
    }
}
