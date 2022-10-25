package kodlama.io.rentAcar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentAcar.entities.concretes.Brands;

public interface BrandsRepository {
	

	List<Brands> getAll();
	

}
