package github.nataliatsi.marketplace.registration.infrastructure.persistence.repository;

import github.nataliatsi.marketplace.registration.domain.Customer;
import github.nataliatsi.marketplace.registration.domain.CustomerRepository;
import github.nataliatsi.marketplace.registration.infrastructure.persistence.entity.CustomerEntity;
import github.nataliatsi.marketplace.registration.infrastructure.persistence.mapper.CustomerPersistenceMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaCustomerRepository implements CustomerRepository {

    private final CustomerEntityRepository customerEntityRepository;
    private final CustomerPersistenceMapper mapper;

    public JpaCustomerRepository(CustomerEntityRepository customerEntityRepository, CustomerPersistenceMapper mapper) {
        this.customerEntityRepository = customerEntityRepository;
        this.mapper = mapper;
    }

    @Override
    public Customer save(Customer customer) {
        CustomerEntity saved = customerEntityRepository.save(
                mapper.toEntity(customer)
        );
        return mapper.toDomain(saved);
    }

    @Override
    public List<Customer> findAll() {
        return customerEntityRepository.findAll().stream().map(mapper::toDomain).toList();
    }
}
