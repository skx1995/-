#include <stdio.h>

int Fibonacci(int n) ;    

int main ()
{
    int i;
	for(i=1;i<201;i++)
    printf ("第 %d 个斐波那契数是 %d \n" , i, Fibonacci(i)) ;
    return 0 ;
}

int Fibonacci(int n)
{
    int i = 0 ;
    int a = 1 ;
    int b = 1 ;
    int result = 0 ;
    if (n <= 0)
    {
        return 0 ;
    }
    else if (n <= 2)
    {
        return 1 ;
    }
    else
    {
        for (i = 3 ; i <= n ; i ++)
        {
            result = a + b ;
            a = b ;
            b = result ;
        }
        return result ;
    }
}
