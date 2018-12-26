package ua.com.olh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.olh.models.Product;

/**
 * Created by okten26 on 12/26/18.
 */
@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
}
