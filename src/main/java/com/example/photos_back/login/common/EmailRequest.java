package com.example.photos_back.login.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class EmailRequest {
    private String to;
    private String subject;
    private String setText;
}
