/*
Author:       Sheon Xu
Date Created: 18.8.2020
Last Updated: 18.8.2020
Title:        Loop
Description:  Print the numbers 1 through 10 using while and for loops.
*/

public class Loop {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + 1);
    }
    int cntr = 0;
    while (cntr < 10) {
      cntr++;
      System.out.println(cntr);
    }
  }
}
