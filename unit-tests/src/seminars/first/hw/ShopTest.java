package seminars.first.hw;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов)
     2. Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

    public static void main(String[] args) {
        // Создаем магазин и помещаем туда список продуктов
        Shop shop = new Shop();
        shop.setProducts(getListProducts());

        // Проверяем, что магазин хранит верный список продуктов (количество продуктов)
        assertThat(shop.getProducts()).hasSize(4);

        // Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct().getTitle()).isEqualTo(getListProducts().get(0).getTitle());

        // Проверить, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(shop.getSortedListProducts().get(0).getCost()).isEqualTo(100);
        assertThat(shop.getSortedListProducts().get(1).getCost()).isEqualTo(150);
        assertThat(shop.getSortedListProducts().get(2).getCost()).isEqualTo(200);
        assertThat(shop.getSortedListProducts().get(3).getCost()).isEqualTo(250);
    }
    // создаем список продуктов
    static List<Product> getListProducts() {

        Product apple = new Product();
        apple.setTitle("Apple");
        apple.setCost(250);

        Product banana = new Product();
        banana.setTitle("Banana");
        banana.setCost(150);

        Product pear = new Product();
        pear.setTitle("Pear");
        pear.setCost(100);

        Product tangerine = new Product();
        tangerine.setTitle("Tangerine");
        tangerine.setCost(200);

        List<Product> productList = new ArrayList<>();

        productList.add(apple);
        productList.add(banana);
        productList.add(pear);
        productList.add(tangerine);

        return productList;
    }

}




