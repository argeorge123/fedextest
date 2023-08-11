package edu.washu.bms.fedex.fedexintegration.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Data
public class Recipients {
    private Address address;
    private Contact contact;
}
