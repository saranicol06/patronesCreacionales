# Especificaciones Taller Patrones Creacionales 
## Hecho por
- Axel Bedoya  
- Sara Zuluaga

### 🍕 Pizza Factory
El programa funciona mediante un menú.  
Al ejecutarse, te pedirá que elijas el tipo de masa que deseas: *gruesa, **integral* o *delgada*.  

👉 El programa se ejecuta por:  
[PreparadorPizza.java](DYAS-GoF-CreationalPatterns-PizzaFactory/src/main/java/PreparadorPizza.java)

---

### 🎮 Game Refactoring
Este programa funciona mediante un archivo de configuración ubicado en:  
[config.properties](DYAS-GoF-CreationalPatterns-GameRefactoring/src/main/resources/config.properties)

En este archivo debes especificar una de las siguientes opciones para cambiar el modo de juego:

- *SPRITE*  
  properties
  factory.class=com.balitechy.spacewar.main.SpriteGameFactory



- **VECTOR**  
  properties
  factory.class=com.balitechy.spacewar.main.VectorGameFactory


- *COLORFUL*  
  ```properties
  factory.class=com.balitechy.spacewar.main.ColorfulVectorGameFactory


👉 El programa se ejecuta por:  
[Game.java](DYAS-GoF-CreationalPatterns-GameRefactoring/src/main/java/com/balitechy/spacewar/main/Game.java)
