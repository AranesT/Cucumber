# language: ru

@all
Функция: Переход в проект TestProject и проверка  общего количества заведенных заданий
  Предыстория: Выполнена авторизация
  Сценарий: Переход в проект TestProject и проверка  общего количества заведенных заданий
    Дано Открытие main страницы сайта с авторизованными данными
    Тогда Переход на страницу проекта
    И Поверка количества заведенных заданий
