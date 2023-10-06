package interfaces.products;

public interface Product {

    String getName();
    void setName(String name);

    default double getPrice(){
        return 0.0;
    }
    default void setPrice(){

    }

}
