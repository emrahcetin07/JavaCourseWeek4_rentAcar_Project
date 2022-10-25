package kodlama.io.rentAcar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentAcar.dataAccess.abstracts.BrandsRepository;
import kodlama.io.rentAcar.entities.concretes.Brands;
@Repository
public class InMemoryBrandRepository implements BrandsRepository{
	
	List<Brands> brands;

	public InMemoryBrandRepository() {
		brands=new ArrayList<Brands>();
		brands.add(new Brands("BMW",1));
		brands.add(new Brands("BMWa",1));
		brands.add(new Brands("BMWb",1));
		brands.add(new Brands("BMWc",1));
	
	}


	@Override
	public List<Brands> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
