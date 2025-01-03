# Patrón Factory 🎵🐵✨

¿Te gusta complicarte la vida creando objetos manualmente? Pues a mí no. Aquí entra el **Patrón Factory**, un diseño que básicamente dice:
> "Yo me encargo, tú solo dime qué necesitas."

En este ejemplo, lo aplicamos para manejar géneros musicales como **Pop**, **Rock** e **Indie**, porque Radio Monita merece canciones organizadas y bien hechas. 🎶🐵

![Radio Monita GIF](https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExajc1YTk5cWUxa21yempqZzBjbjJtN3k3aHpmNmV1aDJpYmlncWxiZiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/z8rAipWgpvaTB7YDhZ/giphy.gif)

---

## ¿Qué hace el Patrón Factory?

El Patrón Factory centraliza la creación de objetos. En lugar de llenar tu código con `new` y arruinar tu vida, simplemente delegas esa responsabilidad a una fábrica. En nuestro caso:
- Tú eliges un género y un título.
- La fábrica crea la canción correspondiente.
- Y listo, ¡a reproducirla!

Ah, pero si eliges un género no válido, no hay compasión:
> "Género no válido 💀. Inténtalo de nuevo 🤨."

---

## Estructura del Código 🛠️

### **1. Interfaz Base (`Song`)**
Aquí está la regla que toda canción debe seguir para ser parte de Radio Monita. Define dos métodos:
- `play()`: Reproduce la canción. 🎧
- `getDetails()`: Muestra el género y el título, porque siempre es bueno presumir. 📝

```java
public interface Song {
    void play(); // Reproducir
    String getDetails(); // Detalles
}
