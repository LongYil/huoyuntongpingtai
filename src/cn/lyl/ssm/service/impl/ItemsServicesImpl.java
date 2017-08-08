package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Items;
import cn.lyl.ssm.po.ItemsCustom;
import cn.lyl.ssm.po.ItemsQueryVo;

/**
 * <p>Title:ItemsServicesImpl</p>
 * <p>Description:商品管理 </p>
 * @author 李银龙
 *		2017年8月5日
 *		上午11:14:02
 */
@Service(value="itemsService")
@Transactional
public class ItemsServicesImpl implements ItemsService{
	
	@Autowired
	private HibernateTemplate hi;
	@Autowired
	private Items items;
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		//通过ItemsMapperCustom查询数据库
		return null;
	}

	@Override
	public ItemsCustom findItemsById(Integer arg) throws Exception {
		//
		return null;
	}

	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		
	}
	
	@Override
	public void delete(Integer id) throws Exception {
		items.setId(1);
		items.setName("宝马760");
		hi.save(items);
		
	}
}
