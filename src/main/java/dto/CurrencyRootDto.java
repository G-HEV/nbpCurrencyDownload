package dto;

import lombok.Getter;

import java.util.List;

@Getter
public class CurrencyRootDto {
    private String table;
    private String currency;
    private String code;
    private List<CurrencyRateDto> rates;
}

