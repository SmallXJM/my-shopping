package com.example.myshopping.entity;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_id
     *
     * @mbggenerated
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_name
     *
     * @mbggenerated
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_intro
     *
     * @mbggenerated
     */
    private String goodsIntro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_category_id
     *
     * @mbggenerated
     */
    private Long goodsCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_cover_img
     *
     * @mbggenerated
     */
    private String goodsCoverImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_carousel
     *
     * @mbggenerated
     */
    private String goodsCarousel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.original_price
     *
     * @mbggenerated
     */
    private Integer originalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.selling_price
     *
     * @mbggenerated
     */
    private Integer sellingPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.stock_num
     *
     * @mbggenerated
     */
    private Integer stockNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.tag
     *
     * @mbggenerated
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_sell_status
     *
     * @mbggenerated
     */
    private Byte goodsSellStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.goods_detail_content
     *
     * @mbggenerated
     */
    private String goodsDetailContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_id
     *
     * @return the value of product.goods_id
     *
     * @mbggenerated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_id
     *
     * @param goodsId the value for product.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_name
     *
     * @return the value of product.goods_name
     *
     * @mbggenerated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_name
     *
     * @param goodsName the value for product.goods_name
     *
     * @mbggenerated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_intro
     *
     * @return the value of product.goods_intro
     *
     * @mbggenerated
     */
    public String getGoodsIntro() {
        return goodsIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_intro
     *
     * @param goodsIntro the value for product.goods_intro
     *
     * @mbggenerated
     */
    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro == null ? null : goodsIntro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_category_id
     *
     * @return the value of product.goods_category_id
     *
     * @mbggenerated
     */
    public Long getGoodsCategoryId() {
        return goodsCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_category_id
     *
     * @param goodsCategoryId the value for product.goods_category_id
     *
     * @mbggenerated
     */
    public void setGoodsCategoryId(Long goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_cover_img
     *
     * @return the value of product.goods_cover_img
     *
     * @mbggenerated
     */
    public String getGoodsCoverImg() {
        return goodsCoverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_cover_img
     *
     * @param goodsCoverImg the value for product.goods_cover_img
     *
     * @mbggenerated
     */
    public void setGoodsCoverImg(String goodsCoverImg) {
        this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_carousel
     *
     * @return the value of product.goods_carousel
     *
     * @mbggenerated
     */
    public String getGoodsCarousel() {
        return goodsCarousel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_carousel
     *
     * @param goodsCarousel the value for product.goods_carousel
     *
     * @mbggenerated
     */
    public void setGoodsCarousel(String goodsCarousel) {
        this.goodsCarousel = goodsCarousel == null ? null : goodsCarousel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.original_price
     *
     * @return the value of product.original_price
     *
     * @mbggenerated
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.original_price
     *
     * @param originalPrice the value for product.original_price
     *
     * @mbggenerated
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.selling_price
     *
     * @return the value of product.selling_price
     *
     * @mbggenerated
     */
    public Integer getSellingPrice() {
        return sellingPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.selling_price
     *
     * @param sellingPrice the value for product.selling_price
     *
     * @mbggenerated
     */
    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.stock_num
     *
     * @return the value of product.stock_num
     *
     * @mbggenerated
     */
    public Integer getStockNum() {
        return stockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.stock_num
     *
     * @param stockNum the value for product.stock_num
     *
     * @mbggenerated
     */
    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.tag
     *
     * @return the value of product.tag
     *
     * @mbggenerated
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.tag
     *
     * @param tag the value for product.tag
     *
     * @mbggenerated
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_sell_status
     *
     * @return the value of product.goods_sell_status
     *
     * @mbggenerated
     */
    public Byte getGoodsSellStatus() {
        return goodsSellStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_sell_status
     *
     * @param goodsSellStatus the value for product.goods_sell_status
     *
     * @mbggenerated
     */
    public void setGoodsSellStatus(Byte goodsSellStatus) {
        this.goodsSellStatus = goodsSellStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_time
     *
     * @return the value of product.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_time
     *
     * @param createTime the value for product.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.update_time
     *
     * @return the value of product.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.update_time
     *
     * @param updateTime the value for product.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.goods_detail_content
     *
     * @return the value of product.goods_detail_content
     *
     * @mbggenerated
     */
    public String getGoodsDetailContent() {
        return goodsDetailContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.goods_detail_content
     *
     * @param goodsDetailContent the value for product.goods_detail_content
     *
     * @mbggenerated
     */
    public void setGoodsDetailContent(String goodsDetailContent) {
        this.goodsDetailContent = goodsDetailContent == null ? null : goodsDetailContent.trim();
    }
}