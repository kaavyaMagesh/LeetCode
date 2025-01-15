int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

int findContentChildren(int* greed, int greedSize, int* cookieSize, int cookieSizeLength) {
    qsort(greed, greedSize, sizeof(int), compare);
    qsort(cookieSize, cookieSizeLength, sizeof(int), compare);
    int i = 0, j = 0, count = 0;
    while (j < cookieSizeLength && i < greedSize) {
        if (greed[i] <= cookieSize[j]) {
            count++;
            i++;
        }
        j++;
    }
    return count;
}
