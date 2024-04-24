package group1;

import java.util.List;

public class Business {
    private List<ProductFactory> productList;
    private DAOFactory dao;
    public Business(){
        dao = new DAOFactory("jdbc:mysql://unl4gv0g6ppkcyik:zYDmomoVGeEOwKClk08E@beoydmpfmbnzpwcoxzu6-mysql.services.clever-cloud.com:3306/beoydmpfmbnzpwcoxzu6");
        productList = dao.createProduct();
//        dao.saveProduct(productList);
    }


//    manipulate methods
}
