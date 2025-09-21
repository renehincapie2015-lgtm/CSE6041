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

### Semana 5 Encapsulamiento y abstracción
Se encapsularon los atributos de las clases Producto, Usuario y Carrito. Se agregaron los getters y setters. Se agregaron las validaciones a los constructores y setters. Aclarando que Carrito no tiene variables como nombres y valores, pero llama a los setters de sus clases dependientes, como Articulo. Se modificó la clase Producto para que sea abstracta, y sus métodos abstractos son getNombre y getFullNombre. A su vez, las clases ProductoFisico y ProductoDigital extienden a Producto e implementan ambos métodos abstractos.

![Encapsulacion01](https://github.com/user-attachments/assets/ea33af62-a2ec-4d69-9dda-b0be507c1f4a)
![Encapsulacion02](https://github.com/user-attachments/assets/9e8632bb-7057-4263-a007-c657d088e289)
![Encapsulacion03](https://github.com/user-attachments/assets/5708f01d-2749-4e6b-bda4-f0d1f5accfd5)
![Encapsulacion04](https://github.com/user-attachments/assets/0a0bb567-a7e5-434a-81a2-37d273469ee3)
![Encapsulacion05](https://github.com/user-attachments/assets/25bd3be9-0191-439e-85cc-8063f6dbd646)
![Encapsulacion06](https://github.com/user-attachments/assets/11cd7ced-859a-470c-81ab-f8c705dbb25c)
![Encapsulacion07](https://github.com/user-attachments/assets/450103a0-c9fb-4a3d-bcea-88d3be786d9a)
![Encapsulacion08](https://github.com/user-attachments/assets/c77a94ed-f09d-43f0-bbbc-142481ecc9b3)
![Encapsulacion09](https://github.com/user-attachments/assets/e36322d9-43b3-401b-b6c9-3cd08a744359)
![Encapsulacion10](https://github.com/user-attachments/assets/f3c6cb99-cde4-4fd8-a42c-c8e96661cfb3)
![Encapsulacion11](https://github.com/user-attachments/assets/cc43c436-4672-40ab-8abc-69af90ad2be7)
![Encapsulacion12](https://github.com/user-attachments/assets/e97876a9-5c5e-4aee-b0f5-7ec022dcd80e)
![Encapsulacion13](https://github.com/user-attachments/assets/4a12a479-46a3-428f-b51b-376dd8710a94)
![Encapsulacion14](https://github.com/user-attachments/assets/10637fca-71a2-453c-b120-ae8c8c941b7a)
![Encapsulacion15](https://github.com/user-attachments/assets/460a5995-2443-4cdd-ba4a-9490fbc97769)
![Encapsulacion16](https://github.com/user-attachments/assets/3ae40b1e-5012-4fee-9e43-e758365f0b15)
![Encapsulacion17](https://github.com/user-attachments/assets/9c9113c7-d4f3-4ef4-be83-e36bc9266df9)
![Encapsulacion18](https://github.com/user-attachments/assets/3f3cfa8c-e579-4866-a6ae-61f2540b9f02)
![Encapsulacion19](https://github.com/user-attachments/assets/2a5f3e4d-47a0-464d-811b-dcbafe49c2df)
![Abstraccion01](https://github.com/user-attachments/assets/ff683db1-7e90-48f9-be12-95ddaeb9570d)
![Abstraccion02](https://github.com/user-attachments/assets/dc2f5a6c-e38e-4224-bdfd-c49d92790b71)
![Abstraccion03](https://github.com/user-attachments/assets/3fe659f9-a006-4b1d-a33b-bcb504a41e42)
![Abstraccion04](https://github.com/user-attachments/assets/2210cf0b-702b-4b8d-9de4-db723532fe37)

### Semana 6 Clases Abstractas e Interfaces

Se creó la clase abstracta Inventario, y se crearon las clases concretas InventarioDigital e InventarioFisico. El principal desafío se me presenta en que tengo un modelo de clases bastante relacionado. Por lo que no sólo Inventario se volvió clase abstracta, sino también Producto y Stock. De forma que el Carrito y el main también se cambiaron debido a que ya no se puede instanciar las antiguas Producto, Stock o Inventario, sino las nuevas versiones Digital o Físico.
![Abstraccion01](https://github.com/user-attachments/assets/f885f4a3-6d5b-42fb-a5e6-c13149f7005d)
![Abstraccion02](https://github.com/user-attachments/assets/b0c6cc7f-d600-425c-9598-8f3a26ec2520)
![Abstraccion03](https://github.com/user-attachments/assets/7066b15e-4956-4621-85e1-eedd8117924e)
![Abstraccion04](https://github.com/user-attachments/assets/0a3482e9-fb33-4ea3-bbd9-6c732c57547b)
![Abstraccion05](https://github.com/user-attachments/assets/1b2cd1c5-6355-433e-a70f-8d31ee8167f1)
![Abstraccion06](https://github.com/user-attachments/assets/b90873bb-1a04-4b10-a7da-df874aeaebc7)
![Abstraccion07](https://github.com/user-attachments/assets/69a9f645-33f3-4178-a782-2bffb62ff8ee)
![Abstraccion08](https://github.com/user-attachments/assets/1e0104ed-e652-4dbf-8177-68e465592deb)
![Abstraccion09](https://github.com/user-attachments/assets/d060581d-ad2c-4d1a-a9da-b445c30b3697)

Respecto a la Interfaz, se creó la interfaz IProcesoPago. Luego se crearon tres clases que implementan la interfaz: PagoDebito, PagoCredito y PagoPlataforma. No hubo mayor desafío, aparte de escribir código que distinga a cuál clase se está llamando. Se modificó la clase Cliente, que es desde donde hago los llamados al Proceso de Pago: 
![Interfaces01](https://github.com/user-attachments/assets/d332ffbe-fbd6-4ee3-9f10-60342172a83b)
![Interfaces02](https://github.com/user-attachments/assets/dcb22bbc-f3be-4bb6-8bb7-ce80aeedc49f)
![Interfaces03](https://github.com/user-attachments/assets/eef1aa8f-f453-435f-99e1-ddfd28332384)
![Interfaces04](https://github.com/user-attachments/assets/5ed3158f-cba3-4588-a0c2-3e8965c13db4)
![Interfaces05](https://github.com/user-attachments/assets/b81ae7d7-17eb-45c2-b6f3-fc87ae745fc8)

Se adjuntan las modificaciones al diagrama de clases:
![DC01](https://github.com/user-attachments/assets/231e70af-f2a4-42c8-a4b1-e8cf914e9d0a)
![DC02](https://github.com/user-attachments/assets/dc355333-2283-4933-9dec-a2ad6bca92bf)
![DC03](https://github.com/user-attachments/assets/cee3e015-41fd-4c1b-a5e8-8d84ae24026b)
![DC04](https://github.com/user-attachments/assets/ec34f9cf-4f24-48d5-b2ae-f2e3622ab086)
