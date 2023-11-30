<h1>Guia de Escopos em JSF </h1> 
<img width=150 src="https://github.com/JoaoLlucaxs/Escopos_JSF/assets/92184255/1cc4a389-549e-47d8-9fa0-e5f020610228"/>

- Por padrão se não inserirmos um escopo , ele será tipo <strong>@RequestScoped</strong> ou seja a cada requisição os dados irão ser perdidos
- <strong>@ApplicationScoped</strong> supondo que tenha uma lista e adicione itens, se entrar em outro navegador irá estar lá muito bom para compartilhamento de dados
- <strong>@SessionScoped </strong> é a sessão do usuário, não irá compartilhar dados para outros usuário, muito bom para armazenar login seu tempo de vida é enquanto o usuário estiver usando o servidor

- <strong>@ViewScopped </strong> precisa serializar , o ViewScopped tem um ciclo de vida menor que o Session , sobrevive até aquela tela estiver aberta se adicionar item e der refresh some os dados
- <strong>@RequestScopped </strong> cada requisição ele inicia e finaliza o escopo, exemplo ao inseri uma lista ao clicar no botão ele insere, ao clicar novamente ele perde o antigo e entra o inserido (Ele é padrão se não inserir nenhum escopo será request por padrão)

 - <strong>@NoneScopped </strong> Não tem tempo de vida, sempre que inicia ele inicia por demanda ou seja se voce precisa de um dado ele (pega -> entrega -> depois mata) POUCO USADO
  - ==========================OBSERVAÇÃO==================================
  - @PostConstructor usado para depois que seu ManagedBean for instânciado e você quer que algo se inicie insira em cima do método essa anotação
  - @PreDestroy usado para destruir um método/ escopo antes de um objeto ManagedBean ser destruido

