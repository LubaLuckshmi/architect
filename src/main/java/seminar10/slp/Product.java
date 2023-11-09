package seminar10.slp;
import java.util.ArrayList;
import java.util.List;

// Пример сущности
class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Пример репозитория для работы с продуктами
class ProductRepository {
    private List<Product> products = new ArrayList<>();

    // Метод для добавления продукта
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для получения всех продуктов
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}

// Пример сервисного слоя для бизнес-логики
class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    // Метод для добавления продукта с бизнес-логикой
    public void addProductWithLogic(Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) {
            productRepository.addProduct(product);
        }
    }

    // Метод для получения всех продуктов через репозиторий
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}

