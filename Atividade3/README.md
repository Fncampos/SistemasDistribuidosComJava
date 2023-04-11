# AtividadeSistemasDistribuido
Alunos:Israel

## Chat Room Server
Este é um servidor de conversação de mensagens que permite a conexão de vários clientes ao mesmo tempo. Os clientes podem se conectar ao servidor usando um programa no modo "linha de comandos" ou interface gráfica (JFrame) e entrar em uma sala de bate-papo.

A identificação do usuário é feita por um apelido (nickname) que é informado pelo usuário no momento da conexão.

### Como funciona
O servidor usa o protocolo TCP/IP e escuta por conexões na porta 1234. Quando um cliente se conecta, uma nova thread é criada para lidar com a conexão desse cliente. A partir daí, o cliente pode enviar mensagens que serão enviadas para todos os outros clientes conectados ao servidor.

Os seguintes comandos podem ser emitidos pelo cliente:

- "#QUIT": Para sair da sala de bate-papo.
- "#USERS": Para exibir a lista de usuários conectados.
