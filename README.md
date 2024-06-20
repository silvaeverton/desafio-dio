# Documentação  do Código Lista De Compra

O Gerenciador de Lista de Compras é uma ferramenta prática e intuitiva que auxilia no planejamento e organização das suas compras. Desenvolvido para facilitar a rotina diária, este programa oferece diversas funcionalidades para gerenciar seus itens com eficiência.

## Funcionalidades:

* **Adição de Produtos**: Adicione facilmente novos itens à sua lista de compras, incluindo nome, quantidade, preço e status de compra ("comprado" ou "não comprado").

* **Exibição de Produtos**: Visualize todos os itens da sua lista de forma organizada e clara, com informações como nome, quantidade, preço e status de compra.

* **Remoção de Produtos**: Elimine facilmente itens da sua lista que já foram comprados ou que não são mais necessários.

* **Alteração de Status**: Atualize o status dos seus produtos de "não comprado" para "comprado" à medida que você os adquire.

* **Menu Intuitivo**: Navegue facilmente pelas opções do programa através de um menu intuitivo e amigável.

# Classe: ListaDeCompra

### Descrição:

Esta classe gerencia uma lista de compras, permitindo ao usuário adicionar, exibir, remover e alterar o status dos produtos.

#### Atributos:

* **_produtoList_**: Uma lista privada do tipo Produto que armazena os itens da lista de compras.
* **_i_**: Uma variável auxiliar utilizada no loop principal do programa.

#### Métodos:

* **_adicionarProduto()_**:
* Permite ao usuário adicionar um novo produto à lista de compras.
* Solicita informações como nome, quantidade, preço e status de compra do produto.
* Cria um novo objeto _Produto_ com as informações fornecidas e o adiciona à _produtoList_.
* Exibe uma mensagem de sucesso após a adição do produto.

* **_exibirProdutos()_**:
* Exibe todos os produtos na produtoList.
* Se a lista estiver vazia, exibe uma mensagem informando isso.
* Se a lista não estiver vazia, exibe um cabeçalho, a lista de produtos formatada e um rodapé.
* Para cada _produto_, exibe o índice, o nome, a quantidade (se houver), o preço (se houver) e o status de compra.

* **_removerProduto()**_:
* Permite ao usuário remover um _produto_ da lista de compras.
* Solicita ao usuário o índice do _produto_ que deseja remover.
* Valida o índice fornecido para garantir que esteja dentro do intervalo válido da lista.
* Se o índice for válido, remove o _produto_ da _produtoList_ e exibe uma mensagem de sucesso.
* Se o índice for inválido, exibe uma mensagem de erro.

* **_alterarStatusProduto(int indice)_**:
* Permite ao usuário alterar o status de compra de um produto ("comprado" ou "não comprado").
* Recebe um parâmetro _int indice_ que representa o índice do produto na lista.
* Valida o índice fornecido para garantir que esteja dentro do intervalo válido da lista.
* Se o índice for válido, recupera o objeto Produto correspondente e inverte seu status de compra.
* Exibe uma mensagem de sucesso indicando que o status do produto foi alterado.
* Se o índice for inválido, exibe uma mensagem de erro.
* **_rodarPrograma()_**:
* Exibe um menu principal ao usuário com as opções disponíveis (adicionar, exibir, remover e marcar como comprado/não).
* Permite ao usuário selecionar uma opção usando a entrada do teclado.
* Chama o método correspondente com base na opção selecionada.
* Permite ao usuário continuar ou sair do programa após cada operação.
* Exibe uma mensagem de finalização ao sair do programa.
* **_main(String[] args)_**:
* Cria um novo objeto ListaDeCompra e chama o método rodarPrograma() para iniciar o programa.



