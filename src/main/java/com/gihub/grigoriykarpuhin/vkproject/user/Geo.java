package com.gihub.grigoriykarpuhin.vkproject.user;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Geo {
    private String lat;
    private String lng;
}
