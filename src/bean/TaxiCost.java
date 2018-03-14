package bean;

import iface.IPrice;

/**
 * 小汽车计算价格
 * 
 * @author MtmWp
 *
 */
public class TaxiCost implements IPrice {

	@Override
	public String countPrice(int path) {
		return path*3+1+"";
		
	}

}
