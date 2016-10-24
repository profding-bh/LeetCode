import java.util.HashMap;
import java.util.Map;


public class Twosum2 
{

	 public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int complement;

		for(int i = 0;i< nums.length;++i) //至少需要循环整个数组
		 { 
			complement = target - nums[i];
			if(map.containsKey(complement))// 存在key 
			{
				return new int [] {map.get(complement),i};//注意是{map.get(complement),i},而不是{i,map.get(complement)};!!!
			}// 只有一种情况，题目要求

			map.put(nums[i],i);//构建哈希表（key,value）,没有多余的元素！！！
		 }	
        throw new IllegalArgumentException("No two sum solution");
    }
	

	public static void main(String[] args) 
	{
	// 方法一：	
	//	int a[]  = new int[11];
	//	for(int i = 0;i<a.length; ++i)
	//		a[i] = i+1;

	// 方法二：
	int a[]  = new int[] {2,7,11,15};
	int b[];
	b	=  twoSum(a,9);


		for(int i = 0;i<b.length;++i)
			System.out.print(b[i]+" ");
		System.out.print("\n");
		


	}
}
