package com.dao;

import com.entity.FangdaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangdaixinxiVO;
import com.entity.view.FangdaixinxiView;


/**
 * 放贷信息
 * 
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface FangdaixinxiDao extends BaseMapper<FangdaixinxiEntity> {
	
	List<FangdaixinxiVO> selectListVO(@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);
	
	FangdaixinxiVO selectVO(@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);
	
	List<FangdaixinxiView> selectListView(@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);

	List<FangdaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);
	
	FangdaixinxiView selectView(@Param("ew") Wrapper<FangdaixinxiEntity> wrapper);
	

}
