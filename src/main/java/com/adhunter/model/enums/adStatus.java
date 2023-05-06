package com.adhunter.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum adStatus {
    WAITING("Ожидание"),
    ACTIVE("Активно"),
    SOLD("Закрыто"),
    REFUSED("Отказано");
    private final String name;
}

