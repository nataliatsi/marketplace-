package github.nataliatsi.marketplace.registration.domain;

import lombok.*;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Customer {
    private UUID id;
    private String name;
    private String email;
}
