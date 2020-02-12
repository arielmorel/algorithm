package com.arielmorel;

/**
 * @author Ariel Morel
 */

/*
**Problem:
*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

**Function Description

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock

**Input Format

The first line contains an integer `n`, the number of socks represented in `ar`.
The second line contains `n` space-separated integers describing the colors `a[i]` of the socks in the pile.

**Output Format

Return the total number of matching pairs of socks that John can sell.

**Sample Input
9
10 20 20 10 10 30 50 10 20

**Sample Output
3

*/
public class SockMerchant {

    // Complete the sockMerchant function below.
    public static int sockMerchant(int n, int[] ar) {
    int count=0;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j <n ; j++) {
                    if(ar[i]==ar[j] && ar[i]>0){
                    ar[i]=0;
                    ar[j]=0;
                    count++;
                }
            }
        }
         return count;
    }

}
