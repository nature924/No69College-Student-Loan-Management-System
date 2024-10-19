package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuxuedaikuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuxuedaikuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuxuedaikuanView;


/**
 * 助学贷款
 *
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface ZhuxuedaikuanService extends IService<ZhuxuedaikuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuxuedaikuanVO> selectListVO(Wrapper<ZhuxuedaikuanEntity> wrapper);
   	
   	ZhuxuedaikuanVO selectVO(@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);
   	
   	List<ZhuxuedaikuanView> selectListView(Wrapper<ZhuxuedaikuanEntity> wrapper);
   	
   	ZhuxuedaikuanView selectView(@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuxuedaikuanEntity> wrapper);
   	

}

