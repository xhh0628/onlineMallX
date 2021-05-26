package com.xhh.onlineMall.dao;

import com.xhh.onlineMall.entity.IndexImg;
import com.xhh.onlineMall.entity.IndexImgExample;
import com.xhh.onlineMall.general.GeneralDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexImgMapper extends GeneralDao<IndexImg> {
    int countByExample(IndexImgExample example);

    int deleteByExample(IndexImgExample example);

    List<IndexImg> selectByExample(IndexImgExample example);

    int updateByExampleSelective(@Param("record") IndexImg record, @Param("example") IndexImgExample example);

    int updateByExample(@Param("record") IndexImg record, @Param("example") IndexImgExample example);
}