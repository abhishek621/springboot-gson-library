package com.abhishek.gson.versioning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonV2 {
    private String fullName;
    private int age;
    private String address;
}
