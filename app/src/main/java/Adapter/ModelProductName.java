package Adapter;

public class ModelProductName {
    private String productName, price;
    private int productImg;

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    public int getProductImg() {
        return productImg;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProductImg(int productImg) {
        this.productImg = productImg;
    }
}
