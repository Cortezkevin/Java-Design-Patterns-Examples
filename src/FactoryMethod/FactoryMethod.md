# 🎭 Patrón Factory Method - South Park Edition 🎬✨

![South Park Madness](https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExOGZteGxwbzJnejNzbmU3eDkzdG5sMDUyOHFuejJhMnhleDU3MG50YyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/q3w1IdISgxTzWUN80b/giphy.gif)

## **¿Qué es el Patrón Factory Method?**

El **Patrón Factory Method** es un patrón de diseño **creacional** que resuelve el problema de la **creación de objetos** delegando esta tarea a **subclases especializadas**.

En lugar de usar una fábrica centralizada que lo hace todo (como el Patrón Factory), el Factory Method permite que cada subclase sea responsable de crear sus propios objetos. Esto asegura que cada tipo de objeto sea creado de manera específica y sin confusiones.

> "*¿Cansado de que una fábrica central decida por ti? En el Factory Method, cada clase es independiente y toma sus propias decisiones sobre cómo crear sus objetos.*"

---

## **Diferencias entre Factory y Factory Method**

### **Patrón Factory:**
- Toda la lógica de creación está centralizada en una sola clase (fábrica).
- Es más simple, pero menos flexible si necesitas añadir nuevos tipos de objetos.

### **Patrón Factory Method:**
- Cada subclase tiene su propia fábrica interna.
- Es más flexible, ya que puedes añadir nuevas subclases sin modificar la fábrica original.

En este ejemplo, utilizamos el **Patrón Factory Method** para manejar la creación de personajes de **South Park**, donde cada personaje tiene su propia lógica y una fábrica independiente.

---

## **¿Qué hace este programa?**

1. El usuario selecciona un personaje de South Park: `RANDY`, `TOALLIN`, `BUTTERS`, o `KENNY`.
2. Cada personaje tiene su propia fábrica especializada.
3. El personaje es creado usando su fábrica correspondiente.
4. El personaje se presenta con una frase épica (porque son de *South Park*, obviamente).

Ah, pero si decides ser creativo e inventar un personaje inexistente, el programa no dudará en lanzarte un galletazo. 🍪
