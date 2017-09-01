#ifndef _S096_H
#define _S096_H

/* Header for any general symbols used in class source code.
 * =======================
 * DO NOT EDIT DO NOT EDIT
 * =======================
 */

/* Defines a SIZE_FMT symbol that can be used portably for reading/writing
 * size_t variables across Linux and Windows. Use like this:
 * 
 * size_t n = 5, m = 6;
 * printf( SIZE_FMT " " SIZE_FMT "\n", n, m );
 * 
 * (will print out the same as "5 6\n")
 */
#if defined __MINGW32__ || defined __MINGW64__ || ( defined _WIN32 && ! defined __CYGWIN__ )
#define SIZE_FMT "%Iu"
#else
#define SIZE_FMT "%zu"
#endif

#endif // _S096_H
