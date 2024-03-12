package com.gihub.grigoriykarpuhin.vkproject.user;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Company {
    private String companyName;
    private String catchPhrase;
    private String bs;
}
