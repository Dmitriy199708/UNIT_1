Домашнее задание к занятию «1.1. Основы автоматизации»
Что нужно сделать :

Сделайте ветку testng, в которой:

1. Добавьте в зависимости TestNG:

dependencies {
    testImplementation 'org.testng:testng:7.1.0'

}

test {
    useTestNG()
}
2. Напишите простые автотесты (без параметризации) на основании материала следующего раздела.

На этом уровне для нас поменяется всего три вещи:

Аннотация @Test должна имеет Fully Qualified Name org.testng.annotations.Test
Assert'ы расположены в классе org.testng.Assert (обратите внимание: в TestNG принято actual, expected вместо expected, actual)
Класс и тестовые методы должны иметь модификатор доступа public (именно поэтому мы вам рекомендовали прописывать модификаторы в тестовых классах)
Что нужно сделать :

Сделайте ветку junit4, в которой:

1. Добавьте в зависимости JUnit:

dependencies {
    testImplementation 'junit:junit:4.13'
}

test {
    useJUnit()
}
2. Напишите простые автотесты (без параметризации).

Особенности

На этом уровне для нас поменяется всего три вещи:

Аннотация @Test должна имеет Fully Qualified Name org.junit.Test
Assert'ы расположены в классе org.junit.Assert
Класс и тестовые методы должны иметь модификатор доступа public (именно поэтому мы вам рекомендовали прописывать модификаторы в тестовых классах).
