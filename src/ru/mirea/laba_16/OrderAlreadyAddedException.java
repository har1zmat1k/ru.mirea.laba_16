package ru.mirea.laba_16;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message){
        super(message);
    }
}
