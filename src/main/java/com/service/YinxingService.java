package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinxingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinxingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinxingView;


/**
 * 银行
 *
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface YinxingService extends IService<YinxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinxingVO> selectListVO(Wrapper<YinxingEntity> wrapper);
   	
   	YinxingVO selectVO(@Param("ew") Wrapper<YinxingEntity> wrapper);
   	
   	List<YinxingView> selectListView(Wrapper<YinxingEntity> wrapper);
   	
   	YinxingView selectView(@Param("ew") Wrapper<YinxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinxingEntity> wrapper);
   	

}

