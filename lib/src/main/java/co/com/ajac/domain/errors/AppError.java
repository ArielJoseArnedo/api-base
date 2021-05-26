package co.com.ajac.domain.errors;

public interface AppError {
    String code();
    String message();
    String description();
}
