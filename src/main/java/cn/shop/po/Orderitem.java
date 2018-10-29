package cn.shop.po;

public class Orderitem {
    private Integer id;

    private Integer order_id;

    private Integer product_id;

    private Integer sale_number;

    private Integer sale_price;

    private Integer total_money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getSale_number() {
        return sale_number;
    }

    public void setSale_number(Integer sale_number) {
        this.sale_number = sale_number;
    }

    public Integer getSale_price() {
        return sale_price;
    }

    public void setSale_price(Integer sale_price) {
        this.sale_price = sale_price;
    }

    public Integer getTotal_money() {
        return total_money;
    }

    public void setTotal_money(Integer total_money) {
        this.total_money = total_money;
    }

	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", order_id=" + order_id
				+ ", product_id=" + product_id + ", sale_number=" + sale_number
				+ ", sale_price=" + sale_price + ", total_money=" + total_money
				+ "]";
	}
    
}