package ru.oop.task2;

/**
 * Транспорт
 */
public interface Transport extends Positioned {

    /**
     * Поездка на транспорте до места, максимально близкого к заданному
     */
    void go(Person person, Position destination);
}