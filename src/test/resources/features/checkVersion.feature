# language: ru

@check
Функция: Проверка версии и статуса задачи TestSelenium

  Предыстория: Выполнена авторизация для проверки статуса задачи TestSelenium
    Дано Выполнена авторизация под логином "achirva" и паролем "123qaz!@#QAZ" для проверки статуса задачи TestSelenium

  Сценарий: Проверка версии и статуса задачи TestSelenium
    Дано Октрытие страницы задачи
    Тогда Проверка статуса
    И Проверка версии