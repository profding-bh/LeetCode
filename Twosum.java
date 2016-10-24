import java.util.HashMap;
import java.util.Map;


public class Twosum 
{

	 public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int complement;
		// 构建哈希表
		for(int i = 0;i<nums.length;++i)
			map.put(nums[i],i);// (key,value)

		for(int i = 0;i<nums.length;++i)
		 { 
			complement = target - nums[i];
			//System.out.print(map.get(complement)+"\n");// print value(index)
			if(map.containsKey(complement)  && map.get(complement) != i )// 存在key && value != i 
			{
				return new int [] {i,map.get(complement)};
			}// 只有一种情况，题目要求
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
