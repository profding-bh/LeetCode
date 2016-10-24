#include<iostream>
#include<vector>

using namespace std;


class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
		vector<int> ret = {};


	 for(int i = 0; i< nums.size();++i)
	{
		for(int j= nums.size()-1;j > i;--j)
		{
			if((nums[i] + nums[j]) == target){
				ret.push_back(i);
				ret.push_back(j);
			}		
		}
	}
         return ret;
    }
};

int
main(int argc,char *agrv[])
{
	Solution s;
    vector<int> nums = {2,7,11,15};
	vector<int> ret = {};
	int target = 9;

	ret = s.twoSum(nums,target);
	
	cout<<"[";
    
	for(int i = 0; i<ret.size();++i)
	 {
		cout<<ret[i];		
		if(i == ret.size()-1)
		{
			continue;
		}
		cout<<",";
	  }
	cout<<"]"<<endl;

    return 0;
}

