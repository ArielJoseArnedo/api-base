package co.com.ajac.base.events;

/**
 * It will contain the event metadata, such as: event name, topic, source platform, source context.
 */
public interface IHeader {
    String id();
    String transactionId();
    String name();
    String topic();
    String origin();
}
