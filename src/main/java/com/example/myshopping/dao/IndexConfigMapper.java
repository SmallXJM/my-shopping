package com.example.myshopping.dao;

import com.example.myshopping.entity.IndexConfig;

public interface IndexConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_config
     *
     * @mbggenerated
     */
    int insert(IndexConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_config
     *
     * @mbggenerated
     */
    int insertSelective(IndexConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_config
     *
     * @mbggenerated
     */
    IndexConfig selectByPrimaryKey(Long configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IndexConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table index_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IndexConfig record);
}