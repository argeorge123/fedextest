package edu.washu.bms.fedex.fedexintegration.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Data
@Getter
@Setter
public class Address {
    private List<String> streetLines;
    private String city;
    private String postalCode;
    private String stateOrProvinceCode;
    private String countryCode;
}
