package kodlama.io.rentacar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;

public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Renault"));
    }

    @Override
    public List<Brand> getAllBrands() {
        return brands;
    }
    
}