# OOP_Seminars

__Home_Work_1__

Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.

Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()

В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

Задача со *: 

Разработать интерфейс для VendingMachines на JFrame. В интерфейсе отобразить добавленные в main продукты(ListBox). Поле ввода наличности и кнопку "купить товар"! Все необходимые дополнительные методы класса VendingMachines и Product добавить самостоятельно.

__Home_Work_2__

Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции(поле статическое)

Добавить интерфейс iReturnOrder возврата товара. 
Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.

Добавить комментарии(javadoc) ко всем методам и интерфейсам.

(задача со *)

Реализовать отказ в обслуживании для акционного клиента при превышении участников акции

Сохранить в файл лог работы магазина, включая возвраты товара(реализовать возврат нескольких товаров)

__Home_Work_3__  

Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).  
Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на консоль  
Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль

(задача со *)  
Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы  
Переопределить методы ToString классов StudentGroup(выводить идентификатор группы, количество студентов и список студентов) и StudentSteam(выводить номер потока, количество групп и список студентов с указанием идентификатора группы)