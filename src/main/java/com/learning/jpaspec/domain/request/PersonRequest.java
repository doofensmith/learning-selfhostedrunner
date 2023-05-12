package com.learning.jpaspec.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -8058460407772237969L;

    private String name;
    private String email;

}
