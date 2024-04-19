package com.nestorworks.clickstreamapplication.record;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClickStreamRecord {
    private String request;
    private int status;
}
