package com.after_sunrise.cryptocurrency.bitflyer4j.entity;

/**
 * @author takanori.takase
 * @version 0.0.1
 */
public interface Bank extends Entity<Long, Bank> {

    Boolean isVerified();

    String getName();

    String getBranch();

    String getType();

    String getNumber();

    String getAccount();

}