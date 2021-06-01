package service;


import model.CurrencyDto;
import httpClient.CurrencyClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalculateService {

    private final CurrencyClient currencyClient;

    @Autowired
    public CalculateService(CurrencyClient currencyClient) {
        this.currencyClient = currencyClient;
    }

    public CurrencyDto getCurrency(String currency){
        CurrencyDto response = currencyClient.getInformationCurrency(currency);
        return response;
    }




}
