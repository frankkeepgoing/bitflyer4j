package com.after_sunrise.cryptocurrency.bitflyer4j.entity;

import com.after_sunrise.cryptocurrency.bitflyer4j.core.SideType;
import com.google.gson.annotations.SerializedName;
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
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TradeExecution extends Entity {

    @SerializedName("product_code")
    private final String product;

    @SerializedName("child_order_id")
    private final String child_order_id;

    @SerializedName("child_order_acceptance_id")
    private final String child_order_acceptance_id;

    public interface Response {

        Long getId();

        String getOrderId();

        SideType getSide();

        BigDecimal getPrice();

        BigDecimal getSize();

        BigDecimal getCommission();

        ZonedDateTime getExecDate();

        String getAcceptanceId();

    }

}
