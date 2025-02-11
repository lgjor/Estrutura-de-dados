#include <stdio.h>
#include "Fila.h"

int main(int argc, char *argv[]){

    struct Fila f;
    int elemento;
    create(&f); // Cria a fila vazia

    // Inserções
    insert(&f, 345);
    insert(&f, 917);
    insert(&f, 14);
    insert(&f, 862);
    insert(&f, 5763);
    insert(&f, 2);

    printf("Bem vindos ao IsiBank!\n");

    printf("Atendimento:\n");

    while (!isEmpty(f)){
        elemento = retirar(&f);
        printf("Número da senha a ser removida %d\n", elemento);
    }
    return 0;
}