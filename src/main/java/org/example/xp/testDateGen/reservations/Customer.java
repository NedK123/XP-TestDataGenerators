package org.example.xp.testDateGen.reservations;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private String id;
    private String name;
    private String email;
}
