package Adapter;

public class ModelRelatedProduct {
    private String relatedProductName, relatedProductPrice;
    private int relatedProductImg;

    public String getRelatedProductName() {
        return relatedProductName;
    }

    public String getRelatedProductPrice() {
        return relatedProductPrice;
    }

    public int getRelatedProductImg() {
        return relatedProductImg;
    }

    public void setRelatedProductName(String relatedProductName) {
        this.relatedProductName = relatedProductName;
    }

    public void setRelatedProductPrice(String relatedProductPrice) {
        this.relatedProductPrice = relatedProductPrice;
    }

    public void setRelatedProductImg(int relatedProductImg) {
        this.relatedProductImg = relatedProductImg;
    }
}
