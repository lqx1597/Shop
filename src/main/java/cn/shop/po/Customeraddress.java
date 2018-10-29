package cn.shop.po;

public class Customeraddress {
    private Integer id;

    private String province;

    private String city;

    private String county;

    private String street;

    private String acceptor_name;

    private String acceptor_mobile;

    private Integer customer_id;

    private Integer is_default_address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getAcceptor_name() {
        return acceptor_name;
    }

    public void setAcceptor_name(String acceptor_name) {
        this.acceptor_name = acceptor_name == null ? null : acceptor_name.trim();
    }

    public String getAcceptor_mobile() {
        return acceptor_mobile;
    }

    public void setAcceptor_mobile(String acceptor_mobile) {
        this.acceptor_mobile = acceptor_mobile == null ? null : acceptor_mobile.trim();
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getIs_default_address() {
        return is_default_address;
    }

    public void setIs_default_address(Integer is_default_address) {
        this.is_default_address = is_default_address;
    }

	@Override
	public String toString() {
		return "Customeraddress [id=" + id + ", province=" + province
				+ ", city=" + city + ", county=" + county + ", street="
				+ street + ", acceptor_name=" + acceptor_name
				+ ", acceptor_mobile=" + acceptor_mobile + ", customer_id="
				+ customer_id + ", is_default_address=" + is_default_address
				+ "]";
	}

	
    
}