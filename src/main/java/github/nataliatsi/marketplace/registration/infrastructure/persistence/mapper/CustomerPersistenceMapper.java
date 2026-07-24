package github.nataliatsi.marketplace.registration.infrastructure.persistence.mapper;

import github.nataliatsi.marketplace.registration.domain.Customer;
import github.nataliatsi.marketplace.registration.infrastructure.persistence.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = CustomerNameMapper.class
)
public interface CustomerPersistenceMapper {

    @Mapping(target = "firstName", source = "name", qualifiedByName = "firstName")
    @Mapping(target = "lastName", source = "name", qualifiedByName = "lastName")
    @Mapping(target = "createdAt", ignore = true)
    CustomerEntity toEntity(Customer customer);

    @Mapping(target = "name", source = "customerEntity", qualifiedByName = "fullName")
    Customer toDomain(CustomerEntity customerEntity);
}