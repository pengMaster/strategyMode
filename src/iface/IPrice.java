package iface;

/**
 * 计算价格
 *
 * @author MtmWp
 */
public abstract interface IPrice {
	
	/**
	 * 返回计算后的价格
	 * @param path
	 * @return
	 */
	String countPrice(int path); 
	
}
