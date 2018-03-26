<h1 align="center">策略模式</h1>

<p align="center">
    <img src="https://img.shields.io/badge/bintray-v2.3.5-brightgreen.svg" alt="Latest Stable Version" />
  </a>
  <a href="">
    <img src="https://travis-ci.org/JessYanCoding/MVPArms.svg?branch=master" alt="Build Status" />
  </a>
  <a href="">
    <img src="https://img.shields.io/badge/API-14%2B-blue.svg?style=flat-square" alt="Min Sdk Version" />
  </a>
  <a href="">
    <img src="http://img.shields.io/badge/License-Apache%202.0-blue.svg?style=flat-square" alt="License" />
  </a>
</p>

<p align="center">
  <a href="">
    <b>开启旅程</b>
  </a>
</p> 

案例:计算车费
---------------------
思路: 我们提取一个公共Interface来计算费用三个不同类实现计费接口,再用一个公 共类管理三种不同车辆的计费功能


- 三种车辆费用共同点为计算车费
- 不同点为车辆类型不同
- 公交车费
- 出租车费
- 小汽车费


 ### 1.公共计费接口

```java
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
```
 ### 2.公交车,出租车,小汽车各自计费类
 
 ```java
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

 ```
 
 ```java
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

 ```
  ```java
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


 ```
 
  ### 3.统一管理车类型费用类
  
  ```java
  
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

  ```
## 测试用例 

  ```java
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
  ```
    
### 输出:
    公交车费用:24

    小汽车费用:29

    出租车费用:37

