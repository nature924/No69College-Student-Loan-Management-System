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


import com.dao.HaidaixinxiDao;
import com.entity.HaidaixinxiEntity;
import com.service.HaidaixinxiService;
import com.entity.vo.HaidaixinxiVO;
import com.entity.view.HaidaixinxiView;

@Service("haidaixinxiService")
public class HaidaixinxiServiceImpl extends ServiceImpl<HaidaixinxiDao, HaidaixinxiEntity> implements HaidaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaidaixinxiEntity> page = this.selectPage(
                new Query<HaidaixinxiEntity>(params).getPage(),
                new EntityWrapper<HaidaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaidaixinxiEntity> wrapper) {
		  Page<HaidaixinxiView> page =new Query<HaidaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaidaixinxiVO> selectListVO(Wrapper<HaidaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaidaixinxiVO selectVO(Wrapper<HaidaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaidaixinxiView> selectListView(Wrapper<HaidaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaidaixinxiView selectView(Wrapper<HaidaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
