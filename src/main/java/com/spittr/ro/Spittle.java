package com.spittr.ro;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {

    private final Long id;
    private final Date time;
    private final String message;
    private Double latitude;
    private Double longitude;

    public Spittle(Date time, String message) {
        this(time, message, null, null);
    }

    public Spittle(Date time, String message, Double latitude, Double longitude) {
        this.id = null;
        this.time = time;
        this.message = message;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Date getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
