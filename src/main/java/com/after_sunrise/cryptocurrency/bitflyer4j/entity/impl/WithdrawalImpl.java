package com.after_sunrise.cryptocurrency.bitflyer4j.entity.impl;

import com.after_sunrise.cryptocurrency.bitflyer4j.core.WithdrawalStatusType;
import com.after_sunrise.cryptocurrency.bitflyer4j.entity.Entity;
import com.after_sunrise.cryptocurrency.bitflyer4j.entity.Withdrawal;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * @author takanori.takase
 * @version 0.0.1
 */
@Getter
@AllArgsConstructor
public class WithdrawalImpl extends Entity implements Withdrawal {

    @SerializedName("id")
    private final Long id;

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("currency_code")
    private final String currency;

    @SerializedName("amount")
    private final BigDecimal amount;

    @SerializedName("status")
    private final WithdrawalStatusType status;

    @SerializedName("event_date")
    private final ZonedDateTime eventDate;

}
