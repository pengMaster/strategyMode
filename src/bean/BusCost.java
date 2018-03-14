package bean;

import iface.IPrice;

/**
 * 公交车计算价格
 * 
 * @author MtmWp
 *
 */
public class BusCost implements IPrice {

	@Override
	public String countPrice(int path) {
		return path*2+"";
	}

}
