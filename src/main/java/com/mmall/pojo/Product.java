package com.mmall.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.id
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.category_id
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.name
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.subtitle
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private String subtitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.main_image
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private String mainImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.sub_images
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private String subImages;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.detail
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.price
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.stock
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private Integer stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.status
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.create_time
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_product.update_time
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Product(Integer id, Integer categoryId, String name, String subtitle, String mainImage, String subImages, String detail, BigDecimal price, Integer stock, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.subtitle = subtitle;
        this.mainImage = mainImage;
        this.subImages = subImages;
        this.detail = detail;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Product() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.id
     *
     * @return the value of mmall_product.id
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.id
     *
     * @param id the value for mmall_product.id
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.category_id
     *
     * @return the value of mmall_product.category_id
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.category_id
     *
     * @param categoryId the value for mmall_product.category_id
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.name
     *
     * @return the value of mmall_product.name
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.name
     *
     * @param name the value for mmall_product.name
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.subtitle
     *
     * @return the value of mmall_product.subtitle
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.subtitle
     *
     * @param subtitle the value for mmall_product.subtitle
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.main_image
     *
     * @return the value of mmall_product.main_image
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.main_image
     *
     * @param mainImage the value for mmall_product.main_image
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.sub_images
     *
     * @return the value of mmall_product.sub_images
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public String getSubImages() {
        return subImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.sub_images
     *
     * @param subImages the value for mmall_product.sub_images
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.detail
     *
     * @return the value of mmall_product.detail
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.detail
     *
     * @param detail the value for mmall_product.detail
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.price
     *
     * @return the value of mmall_product.price
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.price
     *
     * @param price the value for mmall_product.price
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.stock
     *
     * @return the value of mmall_product.stock
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.stock
     *
     * @param stock the value for mmall_product.stock
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.status
     *
     * @return the value of mmall_product.status
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.status
     *
     * @param status the value for mmall_product.status
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.create_time
     *
     * @return the value of mmall_product.create_time
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.create_time
     *
     * @param createTime the value for mmall_product.create_time
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_product.update_time
     *
     * @return the value of mmall_product.update_time
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_product.update_time
     *
     * @param updateTime the value for mmall_product.update_time
     *
     * @mbggenerated Fri Nov 23 16:17:54 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}