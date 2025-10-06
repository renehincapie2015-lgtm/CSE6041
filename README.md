![JUnit15](https://github.com/user-attachments/assets/a73fd9dc-70d0-4ea4-b80a-c912937a9ec7)
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

### Semana 7 Patrones de diseño Singleton, Factory y Observer

Se creó la clase Configuracion para el diseño Singleton, y mediante esa clase se indica la información de conexión a una base de datos. Se creó la clase ProcesoPagoFactory para el diseño Factory, y mediante esa clase se producen instancias de las clases PagoDebito, PagoCredito y PagoPlataforma. Se crearon las instancias IObservado e IObservador para el diseño Observer. La clase abstracta Inventario implementa IObservador. La clase Carrito implementa IObservado. Pero, como debe determinar si está notificando un inventario digital o físico, la clase Carrito pasa a ser una abstracta y se crean las clases CarritoDigital y CarritoFisico. Se modifica la clase Cliente para gestionar un carrito físico y uno digital. Se modifica el main en concordancia.
Como desafío se encuentra que la clase Cliente se podría convertir en una abstracta, pero está fuera del alcance de la tarea. Además, el código original hacía que el cliente Alice comprara 4 artículos. Al dividirlo en dos para Alice y dos para Bob, siempre rechazó un artículo en cada uno. Por lo que se dejó en la compra de un artículo por cliente.

![Singleton01](https://github.com/user-attachments/assets/ffccd9c4-a6dd-4ee0-8ec3-2a2441114ea4)
![Factory01](https://github.com/user-attachments/assets/cfc9b1fe-8d5e-494f-a4fd-7e4d5f4dbfad)
![Observer02](https://github.com/user-attachments/assets/69926c37-f87d-46f3-acd6-bf6d3272e6ca)
![Observer01](https://github.com/user-attachments/assets/5c6a26d1-de0f-4ddf-9b84-b11cbb2fadb6)
![Observer03](https://github.com/user-attachments/assets/22819b4e-23e0-4c0e-a48a-b44309feacfd)
![Observer04](https://github.com/user-attachments/assets/e9c8b1ce-2722-41c7-a271-04e393e1dafa)
![Observer05](https://github.com/user-attachments/assets/56db1589-c848-4e21-a9d5-9bc482fda7ed)
![Observer06](https://github.com/user-attachments/assets/8ac7a0f1-354c-4ac6-8f11-ff5c5f7d147a)
![Observer07](https://github.com/user-attachments/assets/41d3fbea-549f-4c04-824e-d5fc32288b19)
![Observer08](https://github.com/user-attachments/assets/ddbd4b9a-5515-4271-a648-272cb0ce3bad)
![Observer09](https://github.com/user-attachments/assets/0859dcca-c0c7-4581-a9b6-5eba91de8657)
![Observer10](https://github.com/user-attachments/assets/418f5193-d739-45f9-8ea6-711244a29059)
![Tarea701](https://github.com/user-attachments/assets/5c97f47d-a93d-4362-a5d2-f76f072fe40a)
![Tarea702](https://github.com/user-attachments/assets/6af50f0d-ebf4-46ef-ab80-975dd4a5d740)
![Tarea703](https://github.com/user-attachments/assets/744ece87-ede8-4c59-ade5-ee9904da3a4b)
![Tarea704](https://github.com/user-attachments/assets/a12f5794-2441-4b15-92f4-60f2977ab990)

Se adjuntan las modificaciones al diagrama de clases:
![DC05](https://github.com/user-attachments/assets/66135efa-de43-4978-a424-36cc6b9b9d4e)
![DC06](https://github.com/user-attachments/assets/16975a58-46d9-4e2d-ad8d-4acc5b70f655)
![DC07](https://github.com/user-attachments/assets/f81abc40-3b80-496a-9727-9ad6749e81fd)
![DC078](https://github.com/user-attachments/assets/be885702-7ce1-4885-9b25-b13299bdfc3d)


### Semana 8 Manejo de Excepciones y Pruebas Unitarias

####Manejo de Excepciones:
Se agregaron excepciones básicas como controlar cantidades o precios negativos, formatos no cumplidos, argumentos vacíos, inventarios mayores al límite. Como desafío queda el que hay muchas validaciones y excepciones similares, por lo que sería mejor una clase Validador que centralice los controles, pero queda por fuera del alcance de la tarea.

![Excepcion01](https://github.com/user-attachments/assets/460bacfc-ea21-46a7-96c8-6b04f0f65d13)
![Excepcion02](https://github.com/user-attachments/assets/ed41e6da-ee8c-47b9-b56c-7b3a1c447ca7)
![Excepcion03](https://github.com/user-attachments/assets/d4bfc293-dc75-4a03-a99d-73949bf4bcda)
![Excepcion04](https://github.com/user-attachments/assets/ad47c925-ee25-4046-b634-c3a16856b2c6)
![Excepcion05](https://github.com/user-attachments/assets/8149576e-b34d-44df-95d6-20187183370f)
![Excepcion06](https://github.com/user-attachments/assets/0387aea4-5f54-4789-9ada-fc299f9274f2)
![Excepcion07](https://github.com/user-attachments/assets/2acdcd58-15d7-47e7-afcc-8c3edfdcb0b9)
![Excepcion08](https://github.com/user-attachments/assets/1f24d521-0646-44ba-8c41-be4bf5f1f114)
![Excepcion09](https://github.com/user-attachments/assets/42eed605-93e1-43c7-8922-c948a40f98d9)
![Excepcion10](https://github.com/user-attachments/assets/eb740049-2cbd-4f14-a9f8-b449bad3e31e)
![Excepcion11](https://github.com/user-attachments/assets/9e497328-6fd1-488d-a3e6-988cc0bf4f60)
![Excepcion12](https://github.com/user-attachments/assets/126830d9-938c-4bea-bf3b-d2680110070c)
![Excepcion13](https://github.com/user-attachments/assets/a1a951c8-e468-469f-9a1d-5cc6a7496139)

####Pruebas Unitarias:
Hubo varios desafíos con este punto. Primero se detectó que la última versión de JUnit, la 5, no corre nativamente con el Builder estándar de Apache NetBeans, que es Ant, y se deben hacer más ajustes. Tocaría instalar los Builders Maven o Gradle, con los que sí es compatible. No se dispone de tiempo para realizar más instalaciones, pero se logra encontrar la solución de realizar tests con JUnit 4, lo cual permite hacer pruebas más rápido y sin instalaciones adicionales. El segundo y más grande desafío es que al probar algunas clases por fuera de la aplicación empezaron a fallar y la primera solución consistió en seguir separando métodos en versión Digital y Física, lo que retrasa más la entrega. Esto incluye que el main ya no realiza llamados a los carritos, sino la clase Cliente se encarga de sus carritos. Y, en tercer lugar, sin detectarse la causa real, los productos al agregarse a sus respectivos carritos quedaban con valor cero, sin afectar los demás atributos. Se tuvo que crear un método adicional en cada carrito para asignar nuevamente el valor.
![JUnit01](https://github.com/user-attachments/assets/717bc8ef-4c4a-4638-b81e-861313384042)
![JUnit02](https://github.com/user-attachments/assets/df3881b1-8b6c-4186-b820-27439ccbd64d)
![JUnit03](https://github.com/user-attachments/assets/e2ba28de-09ac-42f8-be78-d76aad1ae4fd)
![JUnit04](https://github.com/user-attachments/assets/46bb7fa6-d1dc-471e-851b-fdb0c98856a9)
![JUnit05](https://github.com/user-attachments/assets/f8dc2f3b-2219-438f-84d2-4d3a7de984d2)
![JUnit06](https://github.com/user-attachments/assets/b6ff9444-d6a5-41ec-9ae5-5bc914c50114)
![JUnit07](https://github.com/user-attachments/assets/714756ed-a502-424e-b66a-a5f775007c69)
![JUnit08](https://github.com/user-attachments/assets/dfa6fdc6-2ca0-45bf-9221-bdf914f927c7)
![JUnit09](https://github.com/user-attachments/assets/5486a1dc-58a4-4640-bc34-e6a746c51579)
![JUnit10](https://github.com/user-attachments/assets/9068daf9-b2bf-4361-8b37-d9baa232ebf4)
![JUnit11](https://github.com/user-attachments/assets/079296a5-1520-4acc-8f50-e3f3f7edb527)
![JUnit12](https://github.com/user-attachments/assets/c59d31a1-8298-4114-822d-5e6beb747ee0)
![JUnit13](https://github.com/user-attachments/assets/84d8f2a6-89d4-4a4e-94ff-1d84232be5c9)
![JUnit14](https://github.com/user-attachments/assets/b3ea03e0-17b8-422c-8a33-f1b33af3466d)
![JUnit15](https://github.com/user-attachments/assets/7f611e6f-ae2d-447f-ab03-73f6b502062a)
