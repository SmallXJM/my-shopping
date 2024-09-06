package com.example.myshopping.entity;

import java.util.Date;

public class MallUserAddress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.address_id
     *
     * @mbggenerated
     */
    private Long addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.user_phone
     *
     * @mbggenerated
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.default_flag
     *
     * @mbggenerated
     */
    private Byte defaultFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.province_name
     *
     * @mbggenerated
     */
    private String provinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.city_name
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.region_name
     *
     * @mbggenerated
     */
    private String regionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.detail_address
     *
     * @mbggenerated
     */
    private String detailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.is_deleted
     *
     * @mbggenerated
     */
    private Byte isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_address.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.address_id
     *
     * @return the value of t_user_address.address_id
     *
     * @mbggenerated
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.address_id
     *
     * @param addressId the value for t_user_address.address_id
     *
     * @mbggenerated
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.user_id
     *
     * @return the value of t_user_address.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.user_id
     *
     * @param userId the value for t_user_address.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.user_name
     *
     * @return the value of t_user_address.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.user_name
     *
     * @param userName the value for t_user_address.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.user_phone
     *
     * @return the value of t_user_address.user_phone
     *
     * @mbggenerated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.user_phone
     *
     * @param userPhone the value for t_user_address.user_phone
     *
     * @mbggenerated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.default_flag
     *
     * @return the value of t_user_address.default_flag
     *
     * @mbggenerated
     */
    public Byte getDefaultFlag() {
        return defaultFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.default_flag
     *
     * @param defaultFlag the value for t_user_address.default_flag
     *
     * @mbggenerated
     */
    public void setDefaultFlag(Byte defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.province_name
     *
     * @return the value of t_user_address.province_name
     *
     * @mbggenerated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.province_name
     *
     * @param provinceName the value for t_user_address.province_name
     *
     * @mbggenerated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.city_name
     *
     * @return the value of t_user_address.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.city_name
     *
     * @param cityName the value for t_user_address.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.region_name
     *
     * @return the value of t_user_address.region_name
     *
     * @mbggenerated
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.region_name
     *
     * @param regionName the value for t_user_address.region_name
     *
     * @mbggenerated
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.detail_address
     *
     * @return the value of t_user_address.detail_address
     *
     * @mbggenerated
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.detail_address
     *
     * @param detailAddress the value for t_user_address.detail_address
     *
     * @mbggenerated
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.is_deleted
     *
     * @return the value of t_user_address.is_deleted
     *
     * @mbggenerated
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.is_deleted
     *
     * @param isDeleted the value for t_user_address.is_deleted
     *
     * @mbggenerated
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.create_time
     *
     * @return the value of t_user_address.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.create_time
     *
     * @param createTime the value for t_user_address.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_address.update_time
     *
     * @return the value of t_user_address.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_address.update_time
     *
     * @param updateTime the value for t_user_address.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}