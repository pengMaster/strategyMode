package action;

import bean.BusCost;
import bean.CarCost;
import bean.TaxiCost;

public class MainActivity {
	
	public static void main(String[] args) {
		
		//-----------------公交车费用------------------
		CountCostManager mCountCostManager  = new CountCostManager();
		mCountCostManager.setCostType(new BusCost());//设置车类型
		String price = mCountCostManager.countCost(12);//根据路程算具体花销
		System.err.println("公交车费用:"+price+"\n");
		
		//-----------------小汽车费用------------------
		mCountCostManager.setCostType(new CarCost());//设置车类型
		System.err.println("小汽车费用:"+mCountCostManager.countCost(12)+"\n");
		
		//-----------------出租车费用------------------
		mCountCostManager.setCostType(new TaxiCost());//设置车类型
		mCountCostManager.countCost(12);//根据路程算具体花销
		System.err.println("出租车费用:"+mCountCostManager.countCost(12)+"\n");
	}

}
