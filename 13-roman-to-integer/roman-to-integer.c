int romanToInt(char* s) {
    int num[20];  // Array to store integer values of Roman numerals
    int len = strlen(s);  // Length of the input string
    int i = 0;

    // Convert Roman numerals to integer values
    for (char *ptr = s; *ptr != '\0'; ptr++) {
        switch (*ptr) {
            case 'I': num[i++] = 1; break;
            case 'V': num[i++] = 5; break;
            case 'X': num[i++] = 10; break;
            case 'L': num[i++] = 50; break;
            case 'C': num[i++] = 100; break;
            case 'D': num[i++] = 500; break;
            case 'M': num[i++] = 1000; break;
        }
    }

    int sum = 0;
    
    // Process the integer values for the final result
    for (int j = 0; j < len; j++) {
        if (j < len - 1 && num[j] < num[j + 1]) {
            sum += (num[j + 1] - num[j]);  // Handle subtraction case
            j++;  // Skip the next numeral since it's already handled
        } else {
            sum += num[j];  // Handle normal addition case
        }
    }

    return sum;
}