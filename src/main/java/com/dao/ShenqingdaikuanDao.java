package com.dao;

import com.entity.ShenqingdaikuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingdaikuanVO;
import com.entity.view.ShenqingdaikuanView;


/**
 * 申请贷款
 * 
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface ShenqingdaikuanDao extends BaseMapper<ShenqingdaikuanEntity> {
	
	List<ShenqingdaikuanVO> selectListVO(@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);
	
	ShenqingdaikuanVO selectVO(@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);
	
	List<ShenqingdaikuanView> selectListView(@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);

	List<ShenqingdaikuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);
	
	ShenqingdaikuanView selectView(@Param("ew") Wrapper<ShenqingdaikuanEntity> wrapper);
	

}
