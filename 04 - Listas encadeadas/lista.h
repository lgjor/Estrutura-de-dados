struct Caixinha {
    int elemento;
    struct Caixinha *proximo;
};

struct Lista {
    struct Caixinha *inicio;
    struct Caixinha *fim;
};

void create(struct Lista *Lista);
void inserir(struct Lista *Lista, int elemento);
int isEmpty(struct Lista Lista);
int retirar (struct Lista *Lista);
void listar(struct Lista Lista);
