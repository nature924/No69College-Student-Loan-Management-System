package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaoView;


/**
 * 学校
 *
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface XuexiaoService extends IService<XuexiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaoVO> selectListVO(Wrapper<XuexiaoEntity> wrapper);
   	
   	XuexiaoVO selectVO(@Param("ew") Wrapper<XuexiaoEntity> wrapper);
   	
   	List<XuexiaoView> selectListView(Wrapper<XuexiaoEntity> wrapper);
   	
   	XuexiaoView selectView(@Param("ew") Wrapper<XuexiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaoEntity> wrapper);
   	

}

