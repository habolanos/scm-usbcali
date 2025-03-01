# API de Calculadora con Spring Boot

Esta es una API REST simple construida con Spring Boot que permite realizar operaciones básicas de cálculo: suma, resta, multiplicación y división.

## Requisitos

* Java 21 o superior
* Maven
* Postman o curl (opcional)

## Configuración

1.  Clona el repositorio:

    ```bash
    git clone <URL_del_repositorio>
    ```

2.  Navega al directorio del proyecto:

    ```bash
    cd calculator
    ```

3.  Construye el proyecto con Maven:

    ```bash
    mvn clean install
    ```

4.  Ejecuta la aplicación Spring Boot:

    ```bash
    mvn spring-boot:run
    ```

La API estará disponible en `http://localhost:8080`.

## Endpoints

### Suma

* **Path:** `/calculator/sum`
* **Método:** `POST`
* **Cuerpo de la solicitud (JSON):**

    ```json
    {
      "number1": 5,
      "number2": 3
    }
    ```

* **Ejemplo de llamada con curl:**

    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"number1": 5, "number2": 3}' http://localhost:8080/calculator/sum
    ```

### Resta

* **Path:** `/calculator/subtract`
* **Método:** `POST`
* **Cuerpo de la solicitud (JSON):**

    ```json
    {
      "number1": 10,
      "number2": 4
    }
    ```

* **Ejemplo de llamada con curl:**

    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"number1": 10, "number2": 4}' http://localhost:8080/calculator/subtract
    ```

### Multiplicación

* **Path:** `/calculator/multiply`
* **Método:** `POST`
* **Cuerpo de la solicitud (JSON):**

    ```json
    {
      "number1": 6,
      "number2": 7
    }
    ```

* **Ejemplo de llamada con curl:**

    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"number1": 6, "number2": 7}' http://localhost:8080/calculator/multiply
    ```

### División

* **Path:** `/calculator/divide`
* **Método:** `POST`
* **Cuerpo de la solicitud (JSON):**

    ```json
    {
      "number1": 15,
      "number2": 3
    }
    ```

* **Ejemplo de llamada con curl:**

    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"number1": 15, "number2": 3}' http://localhost:8080/calculator/divide
    ```

## Documentación de Swagger

Para ver la documentación de la API utilizando Swagger UI, abre tu navegador y ve a:

http://localhost:8080/swagger-ui.html


## Pruebas

Para ejecutar las pruebas unitarias, utiliza el siguiente comando de Maven:

```bash
mvn test
```

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

    Haz un fork del repositorio.
    Crea una 1 nueva rama con tus cambios: git checkout -b feature/mi-nueva-funcionalidad.   

1. github.com

    github.com
    Realiza tus cambios y haz commit: git commit -am 'Añade mi nueva funcionalidad'.
    Sube tus cambios a tu fork: git push origin feature/mi-nueva-funcionalidad.
    Crea un pull request.

## Licencia

Este proyecto está bajo la licencia MIT.


Este `README.md` proporciona una visión general de la API, instrucciones de configuración, detalles de los endpoints, ejemplos de llamadas con `curl`, información sobre la documentación de Swagger, cómo ejecutar las pruebas y cómo contribuir al proyecto.