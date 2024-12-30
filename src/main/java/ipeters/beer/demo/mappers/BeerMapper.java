package ipeters.beer.demo.mappers;

import ipeters.beer.demo.entities.Beer;
import ipeters.beer.demo.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
