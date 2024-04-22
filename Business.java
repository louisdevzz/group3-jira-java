package group1;

import java.util.List;

public class Business {
    private List<ProductFactory> productList;
    private DAOFactory dao;
    public Business(){
        dao = new DAOFactory("\"jdbc:mysql://localhost/test?\" +\n" +
                "                            \"user=minty&password=greatsqldb\"");
        productList = dao.createProduct();
//        dao.saveProduct(productList);
    }


//    manipulate methods
}
