/** Copyright 2019 Mek Global Limited. */
package org.knowm.xchange.kucoin.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HfOrderResponse {

    private String id;
    private String symbol;
    private String opType;
    private String type;
    private String side;

    private BigDecimal price;
    private BigDecimal size;
    private BigDecimal funds;
    private BigDecimal dealSize;
    private BigDecimal dealFunds;
    private BigDecimal fee;

    private String feeCurrency;
    private String stp;
    private String timeInForce;

    private Boolean postOnly;
    private Boolean hidden;
    private Boolean iceberg;

    private BigDecimal visibleSize;
    private Long cancelAfter;

    private String channel;
    private String clientOid;
    private String remark;
    private String tags;

    private Boolean cancelExist;
    private Boolean active;

    private Date createdAt;
}
