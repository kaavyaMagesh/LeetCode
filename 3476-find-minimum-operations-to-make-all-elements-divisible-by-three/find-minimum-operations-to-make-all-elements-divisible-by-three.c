int minimumOperations (int* nums, int numsSize){
  int c = 0;
  for ( int i=0; i < numsSize; i++){
  if (nums[i]==1){
      nums[i]= nums[i] - 1;
      c++;
      
  }
  else if (nums[i]==2){
  nums[i]= nums[i] + 1;
  c++;
  }
  else{ 
      if (nums[i]%3 !=0)
      if (nums[i]%2 == 0)
      {
      nums[i] = nums[i] -1;
      c++;
      }
      else{
      nums[i]= nums[i] + 1;
      c++;
      }
  }
  } 

   return c;
}

