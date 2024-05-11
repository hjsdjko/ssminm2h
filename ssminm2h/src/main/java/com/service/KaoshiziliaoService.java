package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshiziliaoView;


/**
 * 考试资料
 *
 * @author 
 * @email 
 * @date 2021-05-22 20:19:37
 */
public interface KaoshiziliaoService extends IService<KaoshiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshiziliaoVO> selectListVO(Wrapper<KaoshiziliaoEntity> wrapper);
   	
   	KaoshiziliaoVO selectVO(@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);
   	
   	List<KaoshiziliaoView> selectListView(Wrapper<KaoshiziliaoEntity> wrapper);
   	
   	KaoshiziliaoView selectView(@Param("ew") Wrapper<KaoshiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshiziliaoEntity> wrapper);
   	
}

