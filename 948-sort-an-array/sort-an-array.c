/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArray(int* nums, int numsSize, int* returnSize) {
  
    int Si=0, Gap, position, index;
    int * tmpLst = (int *)malloc(sizeof(int)*numsSize);
    * returnSize = numsSize;

    for (int i=0; i<numsSize; i++) {
        tmpLst[i] = nums[i];
    }

    int Sedgewick[] = {929, 505, 209, 109, 41, 19, 6, 1, 0};

    while (Sedgewick[Si] >= numsSize) {
        Si ++;
    }

    for (Gap=Sedgewick[Si]; Gap>0; Gap=Sedgewick[++Si]) {
        for (index=Gap; index<numsSize; index++) {
            int currentVal = tmpLst[index];
            for (position=index; position>=Gap && tmpLst[position-Gap]>currentVal; position-=Gap) {
                tmpLst[position] = tmpLst[position-Gap];
            }
            tmpLst[position] = currentVal;
        }
    }
    return tmpLst;
}
