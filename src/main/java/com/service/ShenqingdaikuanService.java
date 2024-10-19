package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingdaikuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingdaikuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingdaikuanView;


/**
 * 申请贷款
 *
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface ShenqingdaikuanService extends IService<ShenqingdaikuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingdaikuanVO> selectListVO(Wrapper<ShenqingdaikuanEntity> wrapper);
   	
   	ShenqingdaikuanVO selectVO(@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);
   	
   	List<ShenqingdaikuanView> selectListView(Wrapper<ShenqingdaikuanEntity> wrapper);
   	
   	ShenqingdaikuanView selectView(@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingdaikuanEntity> wrapper);
   	

}

