package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YinxingDao;
import com.entity.YinxingEntity;
import com.service.YinxingService;
import com.entity.vo.YinxingVO;
import com.entity.view.YinxingView;

@Service("yinxingService")
public class YinxingServiceImpl extends ServiceImpl<YinxingDao, YinxingEntity> implements YinxingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinxingEntity> page = this.selectPage(
                new Query<YinxingEntity>(params).getPage(),
                new EntityWrapper<YinxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinxingEntity> wrapper) {
		  Page<YinxingView> page =new Query<YinxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinxingVO> selectListVO(Wrapper<YinxingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinxingVO selectVO(Wrapper<YinxingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinxingView> selectListView(Wrapper<YinxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinxingView selectView(Wrapper<YinxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
