bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {
    if(n==0) return true;
    if(flowerbedSize==1){
        return 1-flowerbed[0];
    }if(flowerbed[0]==0&&flowerbed[1]==0){
        n--;
        flowerbed[0]=1;
    }
    int i=1;
    while(flowerbed[i-1]==1&&flowerbed[i]==1){
        i++;
        if(i>=flowerbedSize) return false;
    }
    for(;i<flowerbedSize-1;i++){
        if(flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0){
            flowerbed[i]=1;
            n--;
            i++;
        }
    }if(flowerbed[flowerbedSize-1]==0&&flowerbed[flowerbedSize-2]==0) n--;
    if(n>0) return false;
    return true;
}