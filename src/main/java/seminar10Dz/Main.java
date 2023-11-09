package seminar10Dz;

import seminar10Dz.exeptions.ProductAddException;
import seminar10Dz.exeptions.ProductServiceDeleteException;
import seminar10Dz.model.Product;
import seminar10Dz.model.ProductService;
import seminar10Dz.model.UnitOfWork;
import seminar10Dz.model.dao.IProductDAO;
import seminar10Dz.model.dao.InMemoryProductDao;
import seminar10Dz.model.repozitory.IRepository;
import seminar10Dz.model.repozitory.ProductRepository;

public class Main {
    public static void main(String[] args) throws ProductAddException, ProductServiceDeleteException {
        IProductDAO productDAO = new InMemoryProductDao();
        IRepository<Product> productRepository = new ProductRepository(productDAO);
        ProductService productService = new ProductService(productRepository);
        UnitOfWork unitOfWork = new UnitOfWork(productService);

        Product productOne = new Product(1, "HP 141w", 17000);
        Product productTwo = new Product(2, "HP 141a", 16000);

        //add two products
        unitOfWork.addProduct(productOne);
        unitOfWork.addProduct(productTwo);

        //print repository size
        System.out.println(productRepository.getAll().size());

        //revert all operations
        unitOfWork.revertAllOperations();

        //commit
        unitOfWork.commit();

        //print repository size
        System.out.println(productRepository.getAll().size());

        //add product again
        unitOfWork.addProduct(productOne);

        //commit
        unitOfWork.commit();

        //print repository size
        System.out.println(productRepository.getAll().size());
    }
}