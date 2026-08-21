# Автоматизированные тесты для мобильного приложения Wiki
<p align="center">  
<a href="https://telegram.org/"><img src="media/icons/wiki.jpg" width="500" height="500"  alt="Telegram"/></a>  
</p>

## Содержание

* <a href="#description">Описание</a>
* <a href="#tools">Технологии и инструменты</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#console">Запуск из терминала</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#telegram">Уведомление в Telegram при помощи бота</a>
* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
  <a id="description"></a>

## Описание:

Автоматизированные тесты для мобильного приложения Wiki. Покрытые сценарии:
1. Поиск по валидному запросу и отображение списка результатов
2. Удаление запроса в строке поиска
3. Переход в настройки Wiki
4. Переход на экран результата
5. Проверка экранов onboarding screen

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="media/icons/intellijidea.png" width="50" height="50"  alt="IDEA"/></a>
<a href="https://developer.android.com/studio"><img src="media/icons/androidstud.png" width="50" height="50"  alt="androidStudio"/></a>  
<a href="https://appium.io/"><img src="media/icons/appium.png" width="50" height="50"  alt="appium"/></a>  
<a href="https://www.browserstack.com/"><img src="media/icons/browsrstc.png" width="50" height="50"  alt="browserstack"/></a>
<a href="https://www.java.com/"><img src="media/icons/java.png" width="50" height="50"  alt="Java"/></a>   
<a href="https://junit.org/junit5/"><img src="media/icons/junit5.png" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="media/icons/gradle.png" width="50" height="50"  alt="Gradle"/></a> 
<a href="https://github.com/"><img src="media/icons/github" width="50" height="50"  alt="Github"/></a> 
<a href="ht[images](images)tps://github.com/allure-framework/allure"><img src="media/icons/allure.png" width="50" height="50"  alt="Allure"/></a>   
<a href="https://www.jenkins.io/"><img src="media/icons/jenkins.png" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://telegram.org/"><img src="media/icons/telegram.png" width="50" height="50"  alt="Telegram"/></a>  
</p>


____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/view/java_students/job/VSemenov_qa-scooter_39/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/view/java_students/job/VSemenov_qa-scooter_39/"><img src="media/screen/jenkins.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *browserName (браузер, по умолчанию chrome)*
- *browserVersion (версия браузера, по умолчанию 127.0)*
- *browserSize (размер окна браузера, по умолчанию 1280x720)*
- *remoteUrl (логин, пароль и адрес удаленного сервера Selenoid)*

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean test
```

***Удалённый запуск через Jenkins:***
```bash  
clean test
-DbrowserName="$BROWSER_NAME"
-DbrowserVersion="$BROWSER_VERSION"
-DbrowserSize="BROWSER_SIZE"
-DremoteUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="media/logo/Allure_Report.svg" width="25"/></a> <a name="Allure"></a> [Allure-отчет](https://jenkins.autotests.cloud/view/java_students/job/VSemenov_qa-scooter_39/allure/)</a>
___

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="media/screen/Allure_integration.png" width="850">  
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="media/logo/AllureTestops.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/5151/dashboards"> Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screen/Test_ops_dashboard.png" width="850">  
</p>  

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="media/screen/Test_ops_test_case.png" width="850">  
</p>

___

<p align="center">  
<img title="Jira" src="media/screen/Jira_integration.png" width="850">  
</p>

____
<a id="telegram"></a>
## <img alt="Telegram" height="25" src="media/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/telegram_bot.png" width="550">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="media/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="media/video/example.gif" width="550" height="350"  alt="video">   
</p>
