# language: ru

@auth
Функция: Авторизация в качестве пользователя

  Сценарий: Ввод данных на странице авторизации и вход на сайт
    Дано Открытие страницы авторизации
    Когда Введен логин "achirva"
    И Введен пароль "123qaz!@#QAZ"
    И нажата кнопка вход
    Тогда Переход на главную страницу



