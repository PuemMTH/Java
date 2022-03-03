#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int value;
    struct node *left;
    struct node *right;
} Node;

Node *createNode(int value){
    Node *newNode = (Node*)malloc(sizeof(Node));
    newNode->value = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void addNode(Node *root, Node *new){
    if(root->value < new->value ){
        if(root->right == NULL){
            root->right = new;
            return;
        }
        addNode(root->right,new);
    }
    else if(root->value >= new->value){
        if(root->left == NULL){
            root->left = new;
            return;
        }
        addNode(root->left,new);
    }
}

void printPreOrderTree(Node *node){
    if(node != NULL){
        printf("%d ",node->value);
        printPreOrderTree(node->left);
        printPreOrderTree(node->right);
    }
}

void printPostOrderTree(Node *node){
    if(node != NULL){
        printPostOrderTree(node->left);
        printPostOrderTree(node->right);
        printf("%d ",node->value);
    }
}

void printInOrderTree(Node *node){
    if(node != NULL){
        printInOrderTree(node->left);
        printf("%d ",node->value);
        printInOrderTree(node->right);
    }
}

int tree_height(Node* root) {
    if (root == NULL)
        return 0;
    else {
        int left_height = tree_height(root->left);
        int right_height = tree_height(root->right);
        if (left_height >= right_height)
            return left_height + 1;
        else
            return right_height + 1;
    }
}

int main(){
    int inputValue;
    scanf("%d",&inputValue);
    if(inputValue == 0){
        printf("empty tree");
        return 0;
    }
    Node *root = createNode(inputValue);
    scanf("%d",&inputValue);
    while(inputValue != 0){
        Node *node = createNode(inputValue);
        addNode(root,node);
        scanf("%d",&inputValue);
    }
    printf("height of tree is %d\n", tree_height(root)-1);
    printf("preorder: ");
    printPreOrderTree(root);
    printf("\npostorder: ");
    printPostOrderTree(root);
    printf("\ninorder: ");
    printInOrderTree(root);

}