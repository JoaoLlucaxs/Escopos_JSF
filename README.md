<h1>Guia de Escopos em JSF </h1> 
<img width=150 src="https://github.com/JoaoLlucaxs/Escopos_JSF/assets/92184255/1cc4a389-549e-47d8-9fa0-e5f020610228"/>

- Por padrão se não inserirmos um escopo , ele será tipo <strong>@RequestScoped</strong> ou seja a cada requisição os dados irão ser perdidos
 
- <strong>@ApplicationScoped</strong> Mantém a instância durante todo o tempo de
execução da aplicação. É um escopo que compartilha os objetos para todos
os usuários do sistema

- <strong>@SessionScoped </strong> Mantém a instância durante diversas requisições e até
mesmo navegações entre páginas, até que a sessão do usuário seja invalidada
ou o tempo limite é atingido. Cada usuário possui sua sessão de navegação,
portanto, os objetos não são compartilhados entre os usuários.

- <strong>@ViewScopped </strong> A instância permanece ativa até que o usuário navegue para
uma próxima página.
- 
- <strong>@RequestScopped </strong> (padrão): Tem vida curta, começando quando é
referenciado em uma única requisição HTTP e terminando quando a
resposta é enviada de volta ao cliente

 - <strong>@NoneScopped </strong> O bean será instanciado a cada vez que for referenciado
 - 
  - ==========================OBSERVAÇÃO==================================
  - @PostConstructor usado para depois que seu ManagedBean for instânciado e você quer que algo se inicie insira em cima do método essa anotação
  - @PreDestroy usado para destruir um método/ escopo antes de um objeto ManagedBean ser destruido

