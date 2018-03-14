package bean;

import iface.IPrice;

/**
 * 出租车计算价格
 * 
 * @author MtmWp
 *
 */
public class CarCost implements IPrice {

	@Override
	public String countPrice(int path) {
		return path*2+5+"";
	}

}
