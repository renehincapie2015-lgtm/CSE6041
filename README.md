#CSE6041
OBJECT-ORIENTED PROGRAMMING

# E-commerce para la empresa Ilumage

## Resumen
Este proyecto consiste en la creación de clases Java para modelar el funcionamiento de un e-commerce, las cuales incluyen Administradores, Clientes, Formas de Pago, Categorías de Productos, y Productos.

Para realizar esta tarea se creó un Diagrama de Clases usando la herramienta Visual Paradigm Standard (Evaluation Copy). Al terminar el diagrama, se generó el código mediante la opción Tools\code\Generate Java Code. Luego se usó la herramienta Apache NetBeans 22 para mejorar el código y ejecutarlo.

## Características clave
- **Tecnologías Clave**
- **Visual Paradigm Standard (Evaluation Copy)**
- **Apache NetBeans 22**
- **Java 21.0.2**

## Desafíos encontrados

### Semana 2
El principal desafío ha sido determinar la clase que debe ejecutar un método. Originalmente creí que debería estar en una clase, y en realidad se debía ejecutar en la que la llama, y en otras ocasiones debía ejecutarla una subclase.
El segundo desafío fue crear el repositorio en GitHub, en lo cual no tengo experiencia.

### Semana 3 Herencia
No hubo mayor desafío. Se agregó la herencia y los métodos correspondientes a los nuevos campos dentro de los Productos digital y Físico, Administrador y Cliente.

<img width="912" height="436" alt="Herencia01" src="https://github.com/user-attachments/assets/7cc0b757-2524-4b34-a722-20e626f9e782" />
<img width="684" height="457" alt="Herencia02" src="https://github.com/user-attachments/assets/8f5bbb4f-9a20-4914-8b8e-b7be7a53d0b7" />
<img width="550" height="467" alt="Herencia03" src="https://github.com/user-attachments/assets/0f1326bd-7b41-413d-b736-e83b274b0a06" />
<img width="482" height="417" alt="Herencia04" src="https://github.com/user-attachments/assets/558f8648-6383-4c80-90fa-c5f5818196ad" />
<img width="323" height="496" alt="Herencia05" src="https://github.com/user-attachments/assets/a3dce007-fa95-45e8-a73b-2f0a78f8c68e" />
<img width="277" height="478" alt="Herencia06" src="https://github.com/user-attachments/assets/b7aa5623-2344-444e-b9e3-c1cb84d44413" />
<img width="507" height="248" alt="Herencia07" src="https://github.com/user-attachments/assets/bd2e9f56-8cee-4903-bb60-675db341835b" />
<img width="874" height="257" alt="Herencia08" src="https://github.com/user-attachments/assets/66c7e443-7daf-4cef-a9e7-f01c38dbb4f2" />
<img width="822" height="261" alt="Herencia09" src="https://github.com/user-attachments/assets/ccab8f0a-5cae-4e55-a6f8-2c384d637ae8" />
<img width="774" height="364" alt="Herencia10" src="https://github.com/user-attachments/assets/3604c49b-9c0b-4915-926d-d11add9f3f55" />
<img width="822" height="288" alt="Herencia11" src="https://github.com/user-attachments/assets/83a4a80d-4052-4819-b3a0-99002d7df791" />

### Semana 4 Polimorfismo
El mayor desafío se encontró en la sobreescritura de métodos, ya que Producto debe volverse abstracta, y varios llamados que usaban new Producto fallaron. Por lo que se debían reemplazar con llamados directos a ProductoFisico o ProductoDigital. O crear una instancia de cualquiera de estas clases, antes de enviarla al parámetro de tipo Producto.

<img width="504" height="324" alt="Polimorfismo01" src="https://github.com/user-attachments/assets/5b289601-9c5c-489b-9291-3da239b45d83" />
<img width="391" height="66" alt="Polimorfismo02" src="https://github.com/user-attachments/assets/09e5ab7a-3b77-4ed8-938c-5293e74e9ec3" />
<img width="400" height="66" alt="Polimorfismo03" src="https://github.com/user-attachments/assets/cd064aad-9caf-47ef-8e08-e23d2d0f5857" />
<img width="801" height="493" alt="Polimorfismo04" src="https://github.com/user-attachments/assets/7c23760b-f4c8-4efd-a39e-27c3e26b01e2" />
<img width="799" height="503" alt="Polimorfismo05" src="https://github.com/user-attachments/assets/8bb20dff-52e4-4a5b-8d4f-4d6842d34b61" />
<img width="552" height="427" alt="Polimorfismo06" src="https://github.com/user-attachments/assets/a6325534-b4ff-4155-993e-5e49db72cbcb" />
<img width="947" height="305" alt="Polimorfismo07" src="https://github.com/user-attachments/assets/79d5b3cd-5b8d-4811-81ab-7cf60df6e8b8" />
<img width="990" height="304" alt="Polimorfismo08" src="https://github.com/user-attachments/assets/0543ae2e-face-432d-be71-0251354be2ef" />
<img width="810" height="345" alt="Polimorfismo09" src="https://github.com/user-attachments/assets/bc17c9e3-de0f-4675-b49f-5f5e4e56f80b" />
<img width="319" height="107" alt="Polimorfismo10" src="https://github.com/user-attachments/assets/4325be1a-6b8a-4532-94aa-f6401148974d" />
<img width="928" height="182" alt="Polimorfismo11" src="https://github.com/user-attachments/assets/f5f57f81-8342-4328-9b1b-e71c60ce975a" />
<img width="868" height="176" alt="Polimorfismo12" src="https://github.com/user-attachments/assets/7b776a27-8121-4bb5-ba22-13b7d3ea1035" />
<img width="729" height="372" alt="Polimorfismo13" src="https://github.com/user-attachments/assets/735cda06-9bf7-48d5-89a2-5cc6366c5044" />
