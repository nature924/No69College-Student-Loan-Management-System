package com.dao;

import com.entity.ZhuxuedaikuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuxuedaikuanVO;
import com.entity.view.ZhuxuedaikuanView;


/**
 * 助学贷款
 * 
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface ZhuxuedaikuanDao extends BaseMapper<ZhuxuedaikuanEntity> {
	
	List<ZhuxuedaikuanVO> selectListVO(@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);
	
	ZhuxuedaikuanVO selectVO(@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);
	
	List<ZhuxuedaikuanView> selectListView(@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);

	List<ZhuxuedaikuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);
	
	ZhuxuedaikuanView selectView(@Param("ew") Wrapper<ZhuxuedaikuanEntity> wrapper);
	

}
