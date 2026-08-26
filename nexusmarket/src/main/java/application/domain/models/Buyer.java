package application.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Buyer extends Participant {

    private String primaryAddress;
    private List<String> additionalAddresses = new ArrayList<>();
}