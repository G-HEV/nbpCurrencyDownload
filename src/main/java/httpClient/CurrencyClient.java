package httpClient;


import dto.CurrencyRootDto;
import model.CurrencyDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CurrencyClient {
    private RestTemplate restTemplate = new RestTemplate();
    private static final String URL_BASE = "http://api.nbp.pl/api/exchangerates/rates/a/";
    private static final String FORMAT_RESPONSE = "?format=json";



    public CurrencyDto getInformationCurrency(String currency){
        CurrencyRootDto current = restTemplate.getForObject(URL_BASE+"{currency}"+FORMAT_RESPONSE,CurrencyRootDto.class,currency);
        return CurrencyDto.builder().code(current.getCode())
                                    .currency(current.getCurrency())
                                    .mid(current.getRates().get(0).getMid())
                                    .build();
    }
}
