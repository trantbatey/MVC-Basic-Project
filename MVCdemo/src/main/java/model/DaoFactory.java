package model;

public class DaoFactory {
    private static ProductInterface productsDao;

    public static ProductInterface getProductsDao() {
        if (productsDao == null) {
            productsDao = (ProductInterface) new ProductImp();
        }
        return productsDao;
    }
}
