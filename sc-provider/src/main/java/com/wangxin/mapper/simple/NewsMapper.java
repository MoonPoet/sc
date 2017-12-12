package com.wangxin.mapper.simple;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wangxin.api.model.simple.News;
import com.wangxin.mapper.BaseMapper;


/** 
 * @Description 新闻mapper接口
 * @author 王鑫 
 * @date Mar 16, 2017 3:35:19 PM  
 */
@Mapper
public interface NewsMapper extends BaseMapper<String, News> {

    List<News> findNewsByKeywords(@Param("keywords") String keywords);

    List<News> findNewsByPage(@Param("keywords") String keywords);

    List<News> findNewsByTitle(@Param("title")String title);
}