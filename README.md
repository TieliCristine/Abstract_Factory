# Abstract Factory
Implementation of the GoF Creational Pattern Abstract Factory

The Abstract Factory pattern is an evolution of the Factory Method, allowing the creation of families of related objects without specifying their concrete classes.

We will modify the notification example to use the Abstract Factory, enabling the creation of distinct factories for different notification channels.

## Project Structure:
Notification Interface → Defines notifyUser().

Concrete Implementations (EmailNotification, SMSNotification, PushNotification) → Concrete notification types.

NotificationFactory Interface → Defines the factory to create notifications.

Concrete Factories (EmailNotificationFactory, SMSNotificationFactory, PushNotificationFactory) → Create the corresponding notification objects.

Main Class → Demonstrates the use of Abstract Factory.

This approach is useful when there is a need to create families of related objects. 
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

# Abstract Factory
Implementação do padrão GoF Criacional Abstract Factory

O Abstract Factory é uma evolução do Factory Method, permitindo a criação de famílias de objetos relacionados sem especificar suas classes concretas.

Vamos modificar o exemplo de notificações para usar Abstract Factory, permitindo criar fábricas distintas para diferentes canais de notificação.

## Estrutura do Projeto:
Interface Notification → Define notifyUser().

Implementações (EmailNotification, SMSNotification, PushNotification) → Notificações concretas.

Interface NotificationFactory → Define o Factory para criar notificações.

Fábricas concretas (EmailNotificationFactory, SMSNotificationFactory, PushNotificationFactory) → Criam os objetos de notificação correspondentes.

Classe Main → Demonstra o uso do Abstract Factory.

Essa abordagem é útil quando há necessidade de criar famílias de objetos relacionados. 
