package cn.shop.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class Order {
	//商品图片
	private String product_img;
	
    private Integer id;

    private String order_no;

    private Integer customer_id;

    private Integer total_money;

    private Integer address_id;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date submit_date;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no == null ? null : order_no.trim();
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getTotal_money() {
        return total_money;
    }

    public void setTotal_money(Integer total_money) {
        this.total_money = total_money;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Date getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(Date submit_date) {
        this.submit_date = submit_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    

	public String getProduct_img() {
		return product_img;
	}

	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}

	@Override
	public String toString() {
		return "Order [product_img=" + product_img + ", id=" + id
				+ ", order_no=" + order_no + ", customer_id=" + customer_id
				+ ", total_money=" + total_money + ", address_id=" + address_id
				+ ", submit_date=" + submit_date + ", status=" + status + "]";
	}

	
    
}