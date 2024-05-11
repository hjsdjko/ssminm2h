package com.dao;

import com.entity.KaoshiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshiziliaoVO;
import com.entity.view.KaoshiziliaoView;


/**
 * 考试资料
 * 
 * @author 
 * @email 
 * @date 2021-05-22 20:19:37
 */
public interface KaoshiziliaoDao extends BaseMapper<KaoshiziliaoEntity> {
	
	List<KaoshiziliaoVO> selectListVO(@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);
	
	KaoshiziliaoVO selectVO(@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);
	
	List<KaoshiziliaoView> selectListView(@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);

	List<KaoshiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);
	
	KaoshiziliaoView selectView(@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);
	
}
