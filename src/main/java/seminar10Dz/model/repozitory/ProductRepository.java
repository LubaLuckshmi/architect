package seminar10Dz.model.repozitory;

import seminar10Dz.exeptions.ProductAddException;
import seminar10Dz.model.Product;
import seminar10Dz.model.dao.IProductDAO;

import java.util.List;
/**
 * Реализация репозитория для работы с продуктами, в конструкторе принимает DAO
 */
public class ProductRepository implements IRepository<Product> {

    private final IProductDAO productDAO;

    public ProductRepository(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product getById(int id) {
        return productDAO.find(id);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.findAll();
    }

    @Override
    public void add(Product product) throws ProductAddException {
        if (product.getPrice() < 0) {
            throw new ProductAddException("price lower then 0");
        }
        productDAO.add(product);
    }

    @Override
    public void delete(int id) {
        productDAO.remove(id);
    }
}