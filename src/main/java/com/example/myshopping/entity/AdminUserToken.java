package com.example.myshopping.entity;

import java.util.Date;

public class AdminUserToken {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user_token.admin_user_id
     *
     * @mbggenerated
     */
    private Long adminUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user_token.token
     *
     * @mbggenerated
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user_token.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user_token.expire_time
     *
     * @mbggenerated
     */
    private Date expireTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user_token.admin_user_id
     *
     * @return the value of admin_user_token.admin_user_id
     *
     * @mbggenerated
     */
    public Long getAdminUserId() {
        return adminUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user_token.admin_user_id
     *
     * @param adminUserId the value for admin_user_token.admin_user_id
     *
     * @mbggenerated
     */
    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user_token.token
     *
     * @return the value of admin_user_token.token
     *
     * @mbggenerated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user_token.token
     *
     * @param token the value for admin_user_token.token
     *
     * @mbggenerated
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user_token.update_time
     *
     * @return the value of admin_user_token.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user_token.update_time
     *
     * @param updateTime the value for admin_user_token.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user_token.expire_time
     *
     * @return the value of admin_user_token.expire_time
     *
     * @mbggenerated
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user_token.expire_time
     *
     * @param expireTime the value for admin_user_token.expire_time
     *
     * @mbggenerated
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}