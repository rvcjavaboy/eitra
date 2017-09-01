#ifndef _6S096_LIST_H
#define _6S096_LIST_H
//#include "../src/list.c"
#include <stddef.h>

typedef struct List_node_s List_node;

typedef struct List_s {
  size_t length;
  List_node *front;
} List;

List empty_list( void );

void list_apply( List *list, int (*function_ptr)(int) );
int list_reduce( List *list, int (*function_ptr)(int, int) );

void list_append( List *list, int value );
void list_insert_before( List *list, int insert, int before );
void list_delete( List *list, int value );

void list_clear( List *list );
void list_print( List list );

#endif // _6S096_LIST_H
