package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangdaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangdaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangdaixinxiView;


/**
 * 放贷信息
 *
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface FangdaixinxiService extends IService<FangdaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangdaixinxiVO> selectListVO(Wrapper<FangdaixinxiEntity> wrapper);
   	
   	FangdaixinxiVO selectVO(@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);
   	
   	List<FangdaixinxiView> selectListView(Wrapper<FangdaixinxiEntity> wrapper);
   	
   	FangdaixinxiView selectView(@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangdaixinxiEntity> wrapper);
   	

}

