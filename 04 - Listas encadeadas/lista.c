#include "lista.h"
#include <stdlib.h>

void create(struct Lista *Lista){
    Lista -> inicio = NULL;
};

void inserir(struct Lista *Lista, int elemento){
    struct Caixinha *nova;
    struct Caixinha *aux;
    nova = (struct Caixinha*) malloc(sizeof(struct Caixinha));
    nova -> proximo = NULL; // Depois dela não tem ninguém
    nova -> elemento = elemento;

    // está vazia?

    if (Lista->inicio == NULL){
        Lista->inicio = nova;
    } else {
        aux = Lista->inicio;
        while (aux->proximo != NULL){
            aux = aux->proximo;
        }
        aux->proximo = nova;
    }
};

int isEmpty(struct Lista Lista){
    return (Lista.inicio == NULL);
};

int retirar (struct Lista *Lista){
    struct Caixinha *aux = Lista->inicio;
    int elemento = aux->elemento;
    Lista->inicio = aux->proximo;
    free(aux);
    aux = NULL;
    return elemento;
};

void listar(struct Lista Lista){

};

