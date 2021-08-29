// You are given an integer, . Your task is to print an alphabet rangoli of size . (Rangoli is a form of Indian folk art based on creation of patterns.)

// Different sizes of alphabet rangoli are shown below:

// #size 3

// ----c----
// --c-b-c--
// c-b-a-b-c
// --c-b-c--
// ----c----

// #size 5

// --------e--------
// ------e-d-e------
// ----e-d-c-d-e----
// --e-d-c-b-c-d-e--
// e-d-c-b-a-b-c-d-e
// --e-d-c-b-c-d-e--
// ----e-d-c-d-e----
// ------e-d-e------
// --------e--------

// #size 10

// ------------------j------------------
// ----------------j-i-j----------------
// --------------j-i-h-i-j--------------
// ------------j-i-h-g-h-i-j------------
// ----------j-i-h-g-f-g-h-i-j----------
// --------j-i-h-g-f-e-f-g-h-i-j--------
// ------j-i-h-g-f-e-d-e-f-g-h-i-j------
// ----j-i-h-g-f-e-d-c-d-e-f-g-h-i-j----
// --j-i-h-g-f-e-d-c-b-c-d-e-f-g-h-i-j--
// j-i-h-g-f-e-d-c-b-a-b-c-d-e-f-g-h-i-j
// --j-i-h-g-f-e-d-c-b-c-d-e-f-g-h-i-j--
// ----j-i-h-g-f-e-d-c-d-e-f-g-h-i-j----
// ------j-i-h-g-f-e-d-e-f-g-h-i-j------
// --------j-i-h-g-f-e-f-g-h-i-j--------
// ----------j-i-h-g-f-g-h-i-j----------
// ------------j-i-h-g-h-i-j------------
// --------------j-i-h-i-j--------------
// ----------------j-i-j----------------
// ------------------j------------------
// The center of the rangoli has the first alphabet letter a, and the boundary has the  alphabet letter (in alphabetical order).

// Function Description

// Complete the rangoli function in the editor below.

// rangoli has the following parameters:

// int size: the size of the rangoli
// Returns

// string: a single string made up of each of the lines of the rangoli separated by a newline character (\n)
// Input Format

// Only one line of input containing , the size of the rangoli.

// Constraints


// Sample Input

// 5
// Sample Output

// --------e--------
// ------e-d-e------
// ----e-d-c-d-e----
// --e-d-c-b-c-d-e--
// e-d-c-b-a-b-c-d-e
// --e-d-c-b-c-d-e--
// ----e-d-c-d-e----
// ------e-d-e------
// --------e--------

import java.util.Scanner;

public class AlphabetRangoli {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col = 2*(n + n-1)-1;  // number of char in one row
        char c = (char)('a'+n-1);  // from char we have to begin
        int k = col/2; // half of char in coloumn is '-'

        String str[] = new String[n]; // for storing the first n lines

        for(int i=0,ind=0; i<n; i++,k-=2,ind++){   // ind is for index of str
            int index = 0;  // This index is for index of chararray
            char chararray[] = new char[col];
        //printing '-' k times
            for(int j=0; j<k; j++){
                System.out.print("-");
                chararray[index] = '-';  // storing every char which is printed in stdout
                index++;
            }
        
            int count = 0;  // for number of '-' among characters
            char ch = (char)(c+1); // for increasing and decreasing the char c (eg n is input as 3 so c is 'c') ch is more like a temp variable
            
            for(int y=0; y< 2*i + 1;y++){  // 2*i + 1 char are there in ebery row
                if(y <= i){    // ch must decrease for i+1 char eg: i=1 so till 2 char ch must decrease eg: c-b-  (1th row)
                    ch -= 1;
                }
                else{   // then ch must increase for rest
                    ch += 1;
                }
                System.out.print(ch);
                chararray[index] = ch;  // storing every char which is printed in stdout
                index++;

                if(count < 2*i){   // There are 2*i times '-'  present among characters
                    System.out.print("-");
                    chararray[index] = '-';  // storing every char which is printed in stdout
                    index++;

                    count++;
                }
            }
        //printing '-' k times
            for(int m=0; m<k; m++){
                System.out.print("-");
                chararray[index] = '-';  // storing every char which is printed in stdout
                index++;
            }
            System.out.println();
            str[ind] = String.valueOf(chararray);  // storing each row in str(which is array of strings)
        }
    //Now printing from secondlast row to first
        for(int i=n-2; i>=0; i--){   
            System.out.println(str[i]);
        }
    sc.close();
    }
}
