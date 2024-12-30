package ipeters.beer.demo.mappers;

import ipeters.beer.demo.entities.Customer;
import ipeters.beer.demo.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
