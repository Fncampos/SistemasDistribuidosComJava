# Sistema_Distribbuido-Atividade_Pratica

Os autores deste projeto são ***Letícia Borges***, ***Flávia Campos*** e ***Israel Costa***.
 
## Ativiade 1 - Calculadora Remota em UDP está na diretório "Atividade1".
 
 Algumas observações são: 

 i. A porta utilizada é 9876;

ii. O servidor está no arquivo Server.java;

iii. O cliente está funcionando no arquivo Principal.java;

iv. Deve ser ininiado primeiro o Server.java e depois o Principal.java;

v. o projeto completo (calculadora Remota em UDP) está na pasta Atividade1 no arquivo Calculadora_UDP.zip, no qual deve ser descompactado e executado;

vi. quando for executado o arquivo Principal.java, deve se coloca as operações com espacamento, por exemplo, 2 + 2,  ou 3 * 2, ou 4 - 2, ou 5 / 2, sendo respeitada as operçãos básimcas de matemática ('+' , '*' , '/' e '-').

## Ativiade 2 - Classificados de veículos "Atividade2".


Observações:

i. Servidor e cliente RMI estão no projeto com nome "RMI".

ii. Ao implementar o projeto atentar para que a interface e seu Java packge, pois o nome do 
packge e seu contúdo devem ser iguais no projeto cliente e projeto servidor.

iii. i. A porta utilizada é 1099;

## Ativiade 3 - Chat Room TCP está na diretório "Atividade3".

Este é um servidor de conversação de mensagens que permite a conexão de vários clientes ao mesmo tempo. Os clientes podem se conectar ao servidor usando um programa no modo "linha de comandos" ou interface gráfica (JFrame) e entrar em uma sala de bate-papo.

A identificação do usuário é feita por um apelido (nickname) que é informado pelo usuário no momento da conexão.

### Como funciona
O servidor usa o protocolo TCP/IP e escuta por conexões na porta 1234. Quando um cliente se conecta, uma nova thread é criada para lidar com a conexão desse cliente. A partir daí, o cliente pode enviar mensagens que serão enviadas para todos os outros clientes conectados ao servidor.

Os seguintes comandos podem ser emitidos pelo cliente:

- "#QUIT": Para sair da sala de bate-papo.
- "#USERS": Para exibir a lista de usuários conectados.
