package SOLIDPrinciples;

public class ProductAfterSRP {
    private String name;
    private String product;

    public ProductAfterSRP(String name, String product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }
}

class ProductRepository {
    public void saveProduct(ProductAfterSRP productAfterSRP) {
        System.out.println("Save Product in the Database");
        productAfterSRP.getClass();
    }
}

class InvoiceGenerator {
    public void generateInvoice(ProductAfterSRP productAfterSRP) {
        System.out.println("Generate invoice for the product" + productAfterSRP.getProduct());
    }
}
