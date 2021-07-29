package co.com.ajac.base.events;

import io.reactivex.functions.Consumer;

public interface EventListener<T> extends Consumer<Data<T>> {
    void start();
    Header getHeader(String message);
    Message getMessage(String message);
}
