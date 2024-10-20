package com.alextechsolutions.travelinsights.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TI_customer {
    private Long id;
    private String name;
    private String email;
}
