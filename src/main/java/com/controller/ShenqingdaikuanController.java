package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShenqingdaikuanEntity;
import com.entity.view.ShenqingdaikuanView;

import com.service.ShenqingdaikuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请贷款
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@RestController
@RequestMapping("/shenqingdaikuan")
public class ShenqingdaikuanController {
    @Autowired
    private ShenqingdaikuanService shenqingdaikuanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingdaikuanEntity shenqingdaikuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuexiao")) {
			shenqingdaikuan.setXuexiaomingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yinxing")) {
			shenqingdaikuan.setYinxingmingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shenqingdaikuan.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingdaikuanEntity> ew = new EntityWrapper<ShenqingdaikuanEntity>();

		PageUtils page = shenqingdaikuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingdaikuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingdaikuanEntity shenqingdaikuan, 
		HttpServletRequest request){
        EntityWrapper<ShenqingdaikuanEntity> ew = new EntityWrapper<ShenqingdaikuanEntity>();

		PageUtils page = shenqingdaikuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingdaikuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingdaikuanEntity shenqingdaikuan){
       	EntityWrapper<ShenqingdaikuanEntity> ew = new EntityWrapper<ShenqingdaikuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingdaikuan, "shenqingdaikuan")); 
        return R.ok().put("data", shenqingdaikuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingdaikuanEntity shenqingdaikuan){
        EntityWrapper< ShenqingdaikuanEntity> ew = new EntityWrapper< ShenqingdaikuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingdaikuan, "shenqingdaikuan")); 
		ShenqingdaikuanView shenqingdaikuanView =  shenqingdaikuanService.selectView(ew);
		return R.ok("查询申请贷款成功").put("data", shenqingdaikuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingdaikuanEntity shenqingdaikuan = shenqingdaikuanService.selectById(id);
        return R.ok().put("data", shenqingdaikuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingdaikuanEntity shenqingdaikuan = shenqingdaikuanService.selectById(id);
        return R.ok().put("data", shenqingdaikuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingdaikuanEntity shenqingdaikuan, HttpServletRequest request){
    	shenqingdaikuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingdaikuan);
        shenqingdaikuanService.insert(shenqingdaikuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingdaikuanEntity shenqingdaikuan, HttpServletRequest request){
    	shenqingdaikuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingdaikuan);
        shenqingdaikuanService.insert(shenqingdaikuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenqingdaikuanEntity shenqingdaikuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingdaikuan);
        shenqingdaikuanService.updateById(shenqingdaikuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingdaikuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShenqingdaikuanEntity> wrapper = new EntityWrapper<ShenqingdaikuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuexiao")) {
			wrapper.eq("xuexiaomingcheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yinxing")) {
			wrapper.eq("yinxingmingcheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = shenqingdaikuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
