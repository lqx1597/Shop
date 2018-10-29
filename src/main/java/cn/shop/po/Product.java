package cn.shop.po;

public class Product {
    private Integer id;

    private String product_name;

    private Integer cat_id;

    private String description;

    private String picture_file;

    private Integer sale_price;

    private Integer left_number;

    private Integer shop_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name == null ? null : product_name.trim();
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPicture_file() {
        return picture_file;
    }

    public void setPicture_file(String picture_file) {
        this.picture_file = picture_file == null ? null : picture_file.trim();
    }

    public Integer getSale_price() {
        return sale_price;
    }

    public void setSale_price(Integer sale_price) {
        this.sale_price = sale_price;
    }

    public Integer getLeft_number() {
        return left_number;
    }

    public void setLeft_number(Integer left_number) {
        this.left_number = left_number;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name
				+ ", cat_id=" + cat_id + ", description=" + description
				+ ", picture_file=" + picture_file + ", sale_price="
				+ sale_price + ", left_number=" + left_number + ", shop_id="
				+ shop_id + "]";
	}
    
}