package SOLIDPrinciples;

public class ProductBeforeSRP {
    private String name;
    private String product;

    public ProductBeforeSRP(String name, String product) {
        this.name = name;
        this.product = product;
    }

    // save product
    public void saveProduct() {
        System.out.println("Saving Product Inside the DB");
    }

    // generate Invoice
    public void invoiceGenerate() {
        System.out.println("Generating Invoice based on the product");
    }

    // The productBeforeSRP is performing two functionalities at the same time
    // saving product in database and as well generating invoice based on the product
    // this is wrong because of SRP(Single Responsibility Principle) says that a class only do one part of application functionality
}
