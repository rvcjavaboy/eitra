#include <stdio.h>
/*
 * See also : http://class.ece.iastate.edu/arun/CprE281_F05/ieee754/ie5.html
 */

union FloatingPointIEEE754 {
    struct {
        unsigned int mantissa : 23;
        unsigned int exponent : 8;
        unsigned int sign : 1;
    } raw;
    float f;
} number;

int main() {
    number.f = -6.8;
    printf("%x, %x, %x", number.raw.mantissa, number.raw.exponent, number.raw.sign ); 
    return 0;
}