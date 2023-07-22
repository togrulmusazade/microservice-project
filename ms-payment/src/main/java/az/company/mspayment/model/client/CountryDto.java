package az.company.mspayment.model.client;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CountryDto {

    String name;
    BigDecimal remainingLimit;
}



