package com.example.myshopping.entity;

public class OrderAddress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.order_id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.user_phone
     *
     * @mbggenerated
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.province_name
     *
     * @mbggenerated
     */
    private String provinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.city_name
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.region_name
     *
     * @mbggenerated
     */
    private String regionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_address.detail_address
     *
     * @mbggenerated
     */
    private String detailAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.order_id
     *
     * @return the value of t_order_address.order_id
     *
     * @mbggenerated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.order_id
     *
     * @param orderId the value for t_order_address.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.user_name
     *
     * @return the value of t_order_address.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.user_name
     *
     * @param userName the value for t_order_address.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.user_phone
     *
     * @return the value of t_order_address.user_phone
     *
     * @mbggenerated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.user_phone
     *
     * @param userPhone the value for t_order_address.user_phone
     *
     * @mbggenerated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.province_name
     *
     * @return the value of t_order_address.province_name
     *
     * @mbggenerated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.province_name
     *
     * @param provinceName the value for t_order_address.province_name
     *
     * @mbggenerated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.city_name
     *
     * @return the value of t_order_address.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.city_name
     *
     * @param cityName the value for t_order_address.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.region_name
     *
     * @return the value of t_order_address.region_name
     *
     * @mbggenerated
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.region_name
     *
     * @param regionName the value for t_order_address.region_name
     *
     * @mbggenerated
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_address.detail_address
     *
     * @return the value of t_order_address.detail_address
     *
     * @mbggenerated
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_address.detail_address
     *
     * @param detailAddress the value for t_order_address.detail_address
     *
     * @mbggenerated
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }
}