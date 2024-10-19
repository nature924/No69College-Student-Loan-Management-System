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


import com.dao.FangdaixinxiDao;
import com.entity.FangdaixinxiEntity;
import com.service.FangdaixinxiService;
import com.entity.vo.FangdaixinxiVO;
import com.entity.view.FangdaixinxiView;

@Service("fangdaixinxiService")
public class FangdaixinxiServiceImpl extends ServiceImpl<FangdaixinxiDao, FangdaixinxiEntity> implements FangdaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangdaixinxiEntity> page = this.selectPage(
                new Query<FangdaixinxiEntity>(params).getPage(),
                new EntityWrapper<FangdaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangdaixinxiEntity> wrapper) {
		  Page<FangdaixinxiView> page =new Query<FangdaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangdaixinxiVO> selectListVO(Wrapper<FangdaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangdaixinxiVO selectVO(Wrapper<FangdaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangdaixinxiView> selectListView(Wrapper<FangdaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangdaixinxiView selectView(Wrapper<FangdaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
