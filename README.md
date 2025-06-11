# NutriMAP - Sistema E-commerce Fitness

## Descripción
Sistema web para venta de suplementos deportivos, ropa y accesorios fitness.
Desarrollado con Spring Boot y MySQL.

## Tecnologías Utilizadas
- Java 11
- Spring Boot 2.7.0
- Spring Data JPA
- MySQL 8.0
- Maven

## Instalación y Configuración
1. Clonar el repositorio
2. Crear base de datos MySQL: `nutrimap_db`
3. Configurar credenciales en `application.properties`
4. Ejecutar: `mvn spring-boot:run`

## API Endpoints
- `GET /api/productos` - Listar todos los productos
- `POST /api/productos` - Crear nuevo producto
- `GET /api/productos/{id}` - Buscar producto por ID
- `GET /api/productos/buscar?nombre=` - Buscar por nombre
- `GET /api/productos/disponibles` - Productos con stock

## Autor
Miguel Ángel Paba Santiago
SENA - Tecnología en Análisis y Desarrollo de Software