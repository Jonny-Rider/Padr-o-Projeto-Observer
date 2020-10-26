# Padrao-Projeto-Observer

O padrão do observer define uma dependência "um-para-muitos" entre objetos, para que quando um objeto mudar de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.
O objeto que está sendo observado é chamado de sujeito. Os objetos que estão observando as mudanças de estado são chamados de observadores ou ouvintes.

Abaixo segue um diagrama de exemplo:

![alt text](https://howtodoinjava.com/wp-content/uploads/2019/01/observer-pattern-arch.jpg)


O padrão do observador tem quatro participantes.

Assunto - interface ou classe abstrata que define as operações para anexar e desanexar observadores ao assunto.
ConcreteSubject - classe de assunto concreto. Ele mantém o estado do objeto e quando ocorre uma mudança no estado, ele notifica os Observadores anexados.
Observer - interface ou classe abstrata que define as operações a serem utilizadas para notificar este objeto.
ConcreteObserver - implementações concretas de Observer.

Neste exemplo, cria se um editor de mensagens do tipo Assunto e três assinantes do tipo Observer. O Publisher publicará a mensagem periodicamente para todos os observadores inscritos ou anexados e eles imprimirão a mensagem atualizada no console.

Nos arquivos deste repositório, temos códigos de exemplo implementando o padrão em JAVA.
