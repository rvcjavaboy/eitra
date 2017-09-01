/*
@author :Ranjit Chavan
@Title:Mit c and Cpp Ass 2 Linked List 

@Date :1/9/17

*/


#include "../include/list.h"
#include <stdio.h>

int sq( int x ) {
  return x * x;
}

int plus( int x, int y ) {
  return x + y;
}

int main(void) {
  int N = 5;
   int result=0;
  List list = empty_list();

  for( int i = 0; i <N; ++i ) {
    list_append( &list, i );
  }

  list_print( list );                            //list print
  list_insert_before(&list,-1,2);                //append before 2 
  list_print( list );                            
  list_delete(&list,4);                          //list delete specfic item
  list_print( list );
  list_apply(&list,sq);                          //list apply sq funtion
  list_print( list );
  result= list_reduce(&list,plus);               //list apply plus funtion 
  printf("Result ::%d\n",result);                 //print result

  list_clear( &list );
  return 0;
}
