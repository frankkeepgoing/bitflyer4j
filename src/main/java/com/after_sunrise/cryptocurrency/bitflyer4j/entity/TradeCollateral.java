package com.after_sunrise.cryptocurrency.bitflyer4j.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * @author takanori.takase
 * @version 0.0.1
 */
public interface TradeCollateral {

    Long getId();

    String getCurrency();

    BigDecimal getChange();

    BigDecimal getAmount();

    String getReasonCode();

    ZonedDateTime getDate();

    @Getter
    @Builder
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class Request extends Entity {
    }

}
