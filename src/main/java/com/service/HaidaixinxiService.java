package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaidaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaidaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaidaixinxiView;


/**
 * 还贷信息
 *
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface HaidaixinxiService extends IService<HaidaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaidaixinxiVO> selectListVO(Wrapper<HaidaixinxiEntity> wrapper);
   	
   	HaidaixinxiVO selectVO(@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);
   	
   	List<HaidaixinxiView> selectListView(Wrapper<HaidaixinxiEntity> wrapper);
   	
   	HaidaixinxiView selectView(@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaidaixinxiEntity> wrapper);
   	

}

