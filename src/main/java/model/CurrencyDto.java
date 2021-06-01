package model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CurrencyDto {

    private String code;
    private double mid;
    private String currency;

}
