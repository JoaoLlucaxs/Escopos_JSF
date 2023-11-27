<h1>Guia de Escopos em JSF </h1> 
<img width=150 src="https://github.com/JoaoLlucaxs/Escopos_JSF/assets/92184255/1cc4a389-549e-47d8-9fa0-e5f020610228"/>

- Por padrão se não inserirmos um escopo , ele será tipo <strong>@RequestScoped</strong> ou seja a cada requisição os dados irão ser perdidos
- <strong>@ApplicationScoped</strong> supondo que tenha uma lista e adicione itens, se entrar em outro navegador irá estar lá muito bom para compartilhamento de dados
- <strong>@SessionScoped </strong> é a sessão do usuário, não irá compartilhar dados para outros usuário, muito bom para armazenar login

