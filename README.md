# Teste de seleção para vaga de Java

# Sistema desenvolvido - sigaBem

Sistema de calculo de frete e prazo de entrega.
O sistema recebe o peso da embalagem a ser transportada, cep de origem e destino e o nome do destinatário. Com base em algumas regras de negocio é calculado o valor do frete e tempo de entrega.

# Utilização do SQL Server
- Foi utilizado SQL Server  como banco de dados e é necessário algumas alterações em application.properties para apontar para o banco de dados da maquina local.
- A criação de tabelas é gerada automaticamente ao rodarmos a aplicação.

# Regras de negócio
 * CEPs com DDDs iguais tem 50% de desconto no valor do frete e entrega prevista de 1 dia
 * CEPs de estados iguais tem 75% de desconto no valor do frete e entrega prevista de 3 dias
 * CEPs de estados diferentes não deve ser aplicado o desconto no valor do frete e entrega prevista de 10 dias
 * O valor do frete é cobrado pelo peso da encomenda, o valor para cada KG é R$1,00

Seu input de entrada deve ser “peso”, “cepOrigem”, “cepDestino” e “nomeDestinatario“

Acesse a documentação em:
https://drive.google.com/file/d/1W_e3vn6RWwUm7Xp-rvNAztRx3IM_oCGG/view?usp=sharing


