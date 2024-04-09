package com.shorten.url;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
public class MyRequest {
    @URL
    private String url;
}
