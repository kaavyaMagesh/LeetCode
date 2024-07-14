/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    int *res = (int *)malloc(sizeof(int) * wordsSize );
    int ind = 0;
    for(int i = 0 ; i < wordsSize ; i++ ) {
        for( int j = 0 ; words[i][j] ; j++ ) {
            if( words[i][j] == x ) {
                res[ind++] = i;
                break;
            } 
        }
    }
    *returnSize = ind;
    return res;
 
}