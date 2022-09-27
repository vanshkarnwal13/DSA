#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node * next;
};
struct node * head = 0;
struct node * newnode;
newnode  = (struct node *)malloc(sizeof(struct node)); 

struct node * create_node(int data){
    newnode->data = data;
    newnode->next = 0;
    return newnode;
}

struct insertion
{

};
