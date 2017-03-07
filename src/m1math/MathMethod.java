/**   
 * Copyright © 2016 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech17Method
 * 描述信息: 
 * 创建日期：2016年1月20日 上午10:19:02 
 * @author malitao
 * @version 
 *//*
package m1math;

import org.apache.commons.math3.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.Skewness;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;

*//** 
 *  
 * 创建日期：2016年1月20日 上午10:19:02 
 * @author malitao
 *//*
public class MathMethod {
	public static void main(String[] args) {
		use01();
	}

	//常用的数学方法
	public static void use01(){
		double [] values = {1,2,3,4,5};
		Mean mean = new Mean();
        double mvalue = mean.evaluate(values);
        StandardDeviation  std= new StandardDeviation();
        double stdValue =  std.evaluate(values);
        System.out.println("均数："+ mvalue+" 标准差："+stdValue);
        Max max = new Max();
        Min min = new Min();
        double dmax = max.evaluate(values);
        double dmin = min.evaluate(values);
        System.out.println("最小数："+ dmin+" 最大值："+dmax);
//        #1、用样本偏度、峰度的极限分布检验
//        # 标准：
//        # 偏度(Skewness，反映单峰分布的对称性)b=0, b>0向右偏，b<0向左偏；同样可以得到p，p<a(0.05)，拒绝原假设，认为不符合正态分布
//        # 峰度(Kurtosis，反映分布峰的尖峭程度)b=3, b>3过尖，b<3过扁；p<a(0.05)，拒绝原假设，认为不符合正态分布
        Skewness sk = new Skewness();
        double skvalue =sk.evaluate(values);//求取偏度
        Kurtosis sis = new Kurtosis();
        double kurvalue=sis.evaluate(values);//求取峰度
        System.out.println("偏度："+ skvalue+" 峰度："+kurvalue);
//        Jarque-Bera检验（偏度和峰度的联合分布检验法）
        int n=values.length;
        double S = skvalue;
        double K = kurvalue;
        double k=K;
//        理论来源：http://baike.baidu.com/link?url=nDmX0Ejq4haImTrU7qE8aLoidXplMGYGaXxWJo2GPJLfc2gvpZr-fAEUUHypkhZt_WWUD1kMkS1TS3DriXbYd_
//        在统计学中，自由度指的是计算某一统计量时，取值不受限制的变量个数。通常df=n-k。其中n为样本含量，k为被限制的条件数或变量个数，或计算某一统计量时用到其它独立统计量的个数。自由度通常用于抽样分布中。
//        第一处的k（自由度）和第二处的k（峰度）的意义是不同的 
//        此处可能有问题
        double jarqueBera = (n-k)/6*(Math.pow(S, 2)+Math.pow((K-3), 2)/4);
        //变相 原系统中对R语言的源代码进行了反编译
//        jarqueBera = (n-k)*Math.pow(s, 2)/6 + (n-k)*Math.pow((k-3), 2)/24;
        //R语言源代码
//        					 n * b1/6 + n * (b2 - 3)^2/24 
        System.out.println("数量为:"+n+" 。Jarque-Bera 值为："+jarqueBera);
     
        //K-S检验的正负值的计算过程,其中一个值的计算 
        //这个也就是每一个点的概率密度函数计算之后得到的值，注意这个公式不是概率密度累积函数
        double varsqrt = stdValue;
        double x1 = values[0];
        double y = (1/Math.sqrt(2*Math.PI*varsqrt)) 
        		* Math.exp(-Math.pow((x1-mvalue),2)/(2*Math.pow(varsqrt,2)));
        System.out.println("其中一个值的计算过程为："+y);
        
	}
}
*/