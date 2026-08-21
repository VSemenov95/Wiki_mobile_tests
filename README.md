# Автоматизированные тесты для мобильного приложения Wiki
<p align="center">  
<a href="https://telegram.org/"><img src="media/icons/wiki.jpg" width="500" height="500"  alt="Telegram"/></a>  
</p>

## Содержание

* <a href="#description">Описание</a>
* <a href="#tools">Технологии и инструменты</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#console">Инструкция по запуску из терминала</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#video">Пример видео выполнения тестов в browserstack</a>
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
<a href="https://github.com/"><img src="media/icons/github.png" width="50" height="50"  alt="Github"/></a> 
<a href="ht[images](images)tps://github.com/allure-framework/allure"><img src="media/icons/allure.png" width="50" height="50"  alt="Allure"/></a>   
<a href="https://www.jenkins.io/"><img src="media/icons/jenkins.png" width="50" height="50"  alt="Jenkins"/></a>  
</p>


____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="media/icons/jenkins.png" width="25"/></a><a name="Сборка"></a> Сборка в [Jenkins](https://jenkins.qa.guru/view/java-students/job/41_SemenovVS_mobile_tests/)</a>
____
<p align="center">  
<a href="https://jenkins.qa.guru/view/java-students/job/41_SemenovVS_mobile_tests/"><img src="media/screens/jenkinsScreen.jpg" alt="Jenkins" width="950"/></a>  
</p>

<a id="console"></a>
## Команды для запуска из терминала
___

***Локальный запуск:***
**Подготовка:**
1. Установить [android studio](https://developer.android.com/studio)
2. В Android studio перейти в SDK Manager и скачать 11 android
3. В AVD Manager скачать образ Pixel 4 для 11 android
4. Установить [node.js](https://nodejs.org/en/download)

**Запуск:**
1. Запустить [Appium Server](https://github.com/appium/appium): ```appium --base-path /wd/hub```
2. Запустить эмулятор: ```emulator -avd Pixel_4```
3. Запустить тесты: ```./gradlew -DdeviceHost=emulator```


***Удалённый запуск через browserstack:***
```bash  
./gradlew -DdeviceHost=browserstack
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="media/icons/allure.png" width="25"/></a> <a name="Allure"></a> [Allure-отчет](https://jenkins.qa.guru/view/java-students/job/41_SemenovVS_mobile_tests/9/allure/)</a>
___

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="media/screens/allureScreen.jpg" width="850">  
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="media/logo/AllureTestops.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/5151/dashboards"> Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screens/testOpsDash.png" width="850">  
</p>  

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="media/screen/Test_ops_test_case.png" width="850">  
</p>

____
<a id="video"></a>
### *Пример видео выполнения тестов в browserstack*
____
<p align="center">
<img title="browserstack" src="media/video/deleteSearch.gif" width="350" height="550"  alt="video">   
</p>
