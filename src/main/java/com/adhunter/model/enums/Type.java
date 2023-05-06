package com.adhunter.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Type {
    SELL("Продажа"),
    DISCUSS("Обсуждение"),
    EXCHANGE("Обмен");
    private final String name;
}

