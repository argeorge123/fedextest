package edu.washu.bms.fedex.fedexintegration.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Data
@Getter
@Setter
@ResponseBody
public class Output {
    private List<TransactionShipments> transactionShipments;
}
