package ru.oop.task3;

/**
 * Транспорт
 */
public interface Transport extends Positioned {

    /**
     * Поездка на транспорте до места, находящегося рядом с местом пересадки или к месту, максимально близкого к заданному
     */
    void go(Person person, Position destination);
}