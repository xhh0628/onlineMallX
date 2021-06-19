package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.IndexImgMapper;
import com.xhh.onlineMall.entity.IndexImg;
import com.xhh.onlineMall.service.IndexImgService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexImgServiceImpl implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;

    @Override
    public ResultVO selectIndexImgs() {
        List<IndexImg> indexImgs = indexImgMapper.selectIndexImgs();
        if (indexImgs.size()==0){
            return new ResultVO(ResStatus.NO,"fail",null);
        }else{
            return new ResultVO(ResStatus.OK,"success",indexImgs);
        }

    }
}
