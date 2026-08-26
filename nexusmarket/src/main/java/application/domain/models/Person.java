package application.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    private String identification;
    private String name;
    private String email;
}