package com.dao;

import com.entity.HaidaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaidaixinxiVO;
import com.entity.view.HaidaixinxiView;


/**
 * 还贷信息
 * 
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface HaidaixinxiDao extends BaseMapper<HaidaixinxiEntity> {
	
	List<HaidaixinxiVO> selectListVO(@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);
	
	HaidaixinxiVO selectVO(@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);
	
	List<HaidaixinxiView> selectListView(@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);

	List<HaidaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);
	
	HaidaixinxiView selectView(@Param("ew") Wrapper<HaidaixinxiEntity> wrapper);
	

}
