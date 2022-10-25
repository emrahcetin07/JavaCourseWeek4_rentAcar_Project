package kodlama.io.rentAcar.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentAcar.business.abstracts.BrandServices;
import kodlama.io.rentAcar.entities.concretes.Brands;

@RestController //annotation(bilgilendirme)
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandServices brandService;
	
	public BrandsController(BrandServices brandService) {
		super();
		this.brandService = brandService;
	}
    @GetMapping("/getAll")
	public List<Brands> getAll(){
		return brandService.getAll();
	}
	
	
	
	

}
