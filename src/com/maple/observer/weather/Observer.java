package com.maple.observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
