# Максимальное количество продаж

## Описание класса SalesManager.
* В цикле проходимся по массиву sale и сохраняем макcимальное значение в переменную max, минимальное значение в переменную min, а обрезанное значение в переменную stat.

## Описание класса Main.
* Создадим объект типа SaleManager и передадим в параметре массив из чисел, обозначающих количество продаж.
* Вызовом метода max возвращаем максимальное значение продаж за неделю, методом min возвращаем минимальное значение за неделю, а методом stat среднее обрезанное значение.

```javascript
SalesManager salesManager = new SalesManager(new int[] {10, 20, 14, 9, 16, 7, 11});
```
```javascript
System.out.println("Максимальная продажа = " + salesManager.max());
        System.out.println("Минимальное значение = " + salesManager.min());
        System.out.println("Среднее обрезанное значение = " + salesManager.stat());
```

* Выведем итог на экран.

## Результат:
### В консоль будет выведено максимальное значение = 20, минимальное значение = 7 и среднее обрезанное значение =12.
