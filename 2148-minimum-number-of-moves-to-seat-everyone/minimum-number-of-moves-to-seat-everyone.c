int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}
int minMovesToSeat(int* seats, int seatsSize, int* students, int studentsSize) {
    qsort(seats,seatsSize, sizeof(int),compare);
    qsort (students,studentsSize, sizeof(int),compare);

    int minMoves= 0;
    for (int i=0; i < seatsSize; i ++){
        minMoves += abs(seats[i] - students[i]);  
          }
          return minMoves;
}

