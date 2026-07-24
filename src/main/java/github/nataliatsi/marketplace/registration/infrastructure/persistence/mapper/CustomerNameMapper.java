package github.nataliatsi.marketplace.registration.infrastructure.persistence.mapper;

import github.nataliatsi.marketplace.registration.infrastructure.persistence.entity.CustomerEntity;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
public class CustomerNameMapper {

    @Named("fullName")
    public String fullName(CustomerEntity entity) {
        return entity.getLastName() == null || entity.getLastName().isBlank()
                ? entity.getFirstName()
                : entity.getFirstName() + " " + entity.getLastName();
    }

    @Named("firstName")
    public String firstName(String name) {
        return name.split(" ", 2)[0];
    }

    @Named("lastName")
    public String lastName(String name) {
        String[] parts = name.split(" ", 2);
        return parts.length > 1 ? parts[1] : null;
    }
}
