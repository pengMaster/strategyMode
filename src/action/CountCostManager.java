package action;

import iface.IPrice;

/**
 * 统一管理车类型以及费用类
 * 
 * @author MtmWp
 *
 */
public class CountCostManager {
	
	IPrice iPrice;
	
	/**
	 * 设置车类型
	 * 
	 * @param price
	 */
	public void setCostType(IPrice price){
		iPrice = price;
	}
	
	/**
	 * 计算价格
	 * 
	 * @param path
	 * @return
	 */
	public String countCost(int path){
		return iPrice.countPrice(path);
	}

}
