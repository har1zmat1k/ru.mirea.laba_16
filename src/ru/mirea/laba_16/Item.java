package ru.mirea.laba_16;

public interface Item {
    Double getCost();
    String getTitle();
    String getDescription();
    void setCost(double cost);
    void setTitle(String title);
    void setDescription(String description);
}
