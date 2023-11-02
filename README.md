# UI-автотесты

Автотесты для тестирования калькулятора https://testsheepnz.github.io/BasicCalculator.html 
<br>
Написано на языке java в сборке maven c подключенными фреймворками junit, selenium и allure. Отчеты allure генерируются с помощью плагина для maven.
<br>
Расположение тестов: src/test/java. 
<br>
# Задание
Написать автотест, покрывающий следующий кейс: Разница двух целых чисел
<br>
* Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
* Проскроллить вниз до конца 
* Выбрать сборку (Build) «Prototype»
* Ввести в поле First number значение «2»
* Ввести в поле Second number значение «3»
* Выбрать операцию (Operation) «Subtract»
* Нажать на кнопку «Calculate»
* Проверить, что в поле ответа (Answer) значение равно «-1»

# Инструкция для запуска
1. Открыть проект в IDE
2. Зпустить тесты с помощью: mvn clean test
4. Создать отчет, который откроется в браузере: mvn allure:serve


