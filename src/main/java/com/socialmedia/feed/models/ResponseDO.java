package com.socialmedia.feed.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDO {
    private String statusCode;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;
}
