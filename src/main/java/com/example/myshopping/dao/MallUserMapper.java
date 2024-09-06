package com.example.myshopping.dao;

import com.example.myshopping.entity.MallUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MallUserMapper {
    /**
     * 根据用户ID删除用户
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 插入一条记录
     * @param record
     * @return
     */
    int insert(MallUser record);

    /**
     * 插入一条记录；不插入null字段
     * @param record
     * @return
     */
    int insertSelective(MallUser record);

    /**
     * 根据用户ID查询用户
     * @param userId
     * @return
     */
    MallUser selectByPrimaryKey(Long userId);

    /**
     * 更新一条记录；不更新null字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     * 更新一条记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(MallUser record);

    /**
     * 查询所有的用户列表
     */
    List<MallUser> selectAll();
}