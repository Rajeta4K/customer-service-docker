package com.dphone.customer.bean;
//dksfbkdjsbfkbs
public class CustomerBean {

    private long customer_id;
    private String customer_first_name;
    private String customer_last_name;
    private String username;
    private long customer_mobile;
    public CustomerBean(){
        super();
    }

    public CustomerBean(long customer_id, String customer_first_name, String customer_last_name, String username, long customer_mobile) {
        this.customer_id = customer_id;
        this.customer_first_name = customer_first_name;
        this.customer_last_name = customer_last_name;
        this.username = username;
        this.customer_mobile = customer_mobile;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_first_name() {
        return customer_first_name;
    }

    public void setCustomer_first_name(String customer_first_name) {
        this.customer_first_name = customer_first_name;
    }

    public String getCustomer_last_name() {
        return customer_last_name;
    }

    public void setCustomer_last_name(String customer_last_name) {
        this.customer_last_name = customer_last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(long customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "customerId=" + customer_id +
                ", customerFirstName='" + customer_first_name + '\'' +
                ", customerLastName='" + customer_last_name + '\'' +
                ", customerEmail='" + username + '\'' +
                ", customerMobile=" + customer_mobile +
                '}';
    }
}
