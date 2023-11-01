# UI-автотесты

Автотесты для тестирования калькулятора https://testsheepnz.github.io/BasicCalculator.html 
<br>
Написано на языке java в системе сборки maven c подключенными фреймворками junit, selenium и allure. Отчеты allure генерируются с помощью плагина для maven.
<br>
Расположение тестов: src/test/java. 
<br>
# Задание
Написать автотест, покрывающий следующий кейс: Разница двух целых чисел
<br>
* Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
*  Проскроллить вниз до конца 
*  Выбрать сборку (Build) «Prototype» 
<br>
* Ввести в поле First number значение «2» 
<br>
* Ввести в поле Second number значение «3»
<br>
* Выбрать операцию (Operation) «Subtract»
<br>
* Нажать на кнопку «Calculate»
<br>
* Проверить, что в поле ответа (Answer) значение равно «-1»

