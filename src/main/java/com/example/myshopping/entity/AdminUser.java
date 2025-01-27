package com.example.myshopping.entity;

public class AdminUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.admin_user_id
     *
     * @mbggenerated
     */
    private Long adminUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.login_user_name
     *
     * @mbggenerated
     */
    private String loginUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.login_password
     *
     * @mbggenerated
     */
    private String loginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.locked
     *
     * @mbggenerated
     */
    private Byte locked;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.admin_user_id
     *
     * @return the value of admin_user.admin_user_id
     *
     * @mbggenerated
     */
    public Long getAdminUserId() {
        return adminUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user.admin_user_id
     *
     * @param adminUserId the value for admin_user.admin_user_id
     *
     * @mbggenerated
     */
    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.login_user_name
     *
     * @return the value of admin_user.login_user_name
     *
     * @mbggenerated
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user.login_user_name
     *
     * @param loginUserName the value for admin_user.login_user_name
     *
     * @mbggenerated
     */
    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName == null ? null : loginUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.login_password
     *
     * @return the value of admin_user.login_password
     *
     * @mbggenerated
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user.login_password
     *
     * @param loginPassword the value for admin_user.login_password
     *
     * @mbggenerated
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.nick_name
     *
     * @return the value of admin_user.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user.nick_name
     *
     * @param nickName the value for admin_user.nick_name
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.locked
     *
     * @return the value of admin_user.locked
     *
     * @mbggenerated
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_user.locked
     *
     * @param locked the value for admin_user.locked
     *
     * @mbggenerated
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
    }
}