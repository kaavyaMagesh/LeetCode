bool isPalindrome(long int x) {
    if(x < 0){
        return false;
    }
    long int m = x, n = 0;
    while(m != 0){
        n = (10 * n) + (m % 10);
        m /= 10;
    }
    return n == x;
}