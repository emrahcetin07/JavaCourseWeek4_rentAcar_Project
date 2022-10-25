package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentAcar.business.abstracts.BrandServices;
import kodlama.io.rentAcar.dataAccess.abstracts.BrandsRepository;
import kodlama.io.rentAcar.entities.concretes.Brands;
@Service
public class BrandManager implements BrandServices{
	private BrandsRepository brandsRepository;
	@Autowired

	public BrandManager(BrandsRepository brandsRepository) {
		super();
		this.brandsRepository = brandsRepository;
	}

	@Override
	public List<Brands> getAll() {
		// iş kuralları yazılacak.
		return brandsRepository.getAll();
	}

}
