 FinanceApp TP3: Gestión Financiera Inteligente

Descripción General

FinanceApp TP3 es una aplicación móvil para Android desarrollada para Software ORT TP3. Su misión es transformar la gestión de las finanzas personales y comerciales, ofreciendo a los usuarios una herramienta intuitiva y potente para monitorear ingresos y egresos, tomar mejores decisiones económicas y construir hábitos saludables.

La aplicación se enfoca en la personalización, habilitando funcionalidades adaptadas a las necesidades del perfil de cada usuario, desde el registro detallado de movimientos hasta la visualización de insights personalizados.

🚀 Características y Funcionalidades Principales

El proyecto se centra en ofrecer una experiencia completa y adaptable para el usuario individual:

📊 Análisis y Reportes Dinámicos

Gestión de Movimientos: Registro simple de ingresos mensuales, gastos fijos y variables.

Categorización: Clasificación de movimientos con categorías personalizables (Hogar, Transporte, Entretenimiento, Salud, etc.).

Visualización: Estadísticas y gráficos interactivos para entender la evolución financiera a lo largo del tiempo.

Resumen Automatizado: Generación de un resumen mensual automatizado con insights y alertas inteligentes sobre hábitos de consumo.

🔎 Navegación y Usabilidad

Búsqueda Avanzada: Filtrado rápido de movimientos por fecha, categoría, monto o palabra clave.

Metas de Ahorro: Establecimiento y seguimiento visual de objetivos de ahorro.

Widget Resumen: Widget configurable en la pantalla de inicio para un vistazo rápido al balance del mes.

Configuración Visual: Modo Claro / Oscuro configurable desde el panel de ajustes para mejorar la experiencia de uso en diferentes condiciones de luz.

🔗 Integración y Control (Funcionalidades Opcionales/Futuras)

Sincronización Bancaria: Sincronización automática con cuentas bancarias o billeteras virtuales (si esta funcionalidad se implementa).

🛠️ Tecnologías y Arquitectura

Este proyecto sigue las mejores prácticas de desarrollo Android moderno y hace uso de los componentes clave de la cursada.

Componente

Tecnología/Herramienta

Propósito

Plataforma

Android (Móvil)

Sistema Operativo de destino.

Lenguaje

Kotlin

Lenguaje principal de desarrollo.

Interfaz de Usuario

Jetpack Compose (Implícito)

Desarrollo declarativo de la UI.

Arquitectura

MVVM (Model-View-ViewModel)

Separación de la lógica de la UI y el manejo del estado (componente visto en clase).

Navegación

Jetpack Navigation

Implementación del componente de navegación para la estructura de la aplicación.

Red

Retrofit, OkHttp

Utilización obligatoria del componente Retrofit para la gestión de llamadas a la API.

Persistencia

Room

Criterio de persistencia de datos local para almacenar transacciones y/o información de usuario offline.

Diseño

Figma

Base visual para la implementación de todas las pantallas y componentes.

✅ Requisitos de Evaluación y Calidad de Código

Los siguientes puntos son cruciales para el desarrollo y la evaluación del proyecto, garantizando una construcción funcional y colaborativa:

Funcionalidad Completa: La aplicación debe funcionar correctamente en su totalidad, cumpliendo con todas las características especificadas en la consigna.

Uso de Componentes: Se debe evidenciar la utilización de los componentes y técnicas vistas en clase (ej. State Hoisting, Coroutines, Flow, etc.).

Navegación: El componente de Navegación debe estar implementado y gestionar el flujo entre pantallas de forma eficiente.

Codificación Colaborativa: Todos los integrantes del equipo deben realizar commits de código suficientes para ser evaluados, demostrando participación activa en el desarrollo.

Persistencia y API: Se requiere la correcta implementación de Retrofit para la comunicación con la API y el uso de Room para la persistencia de datos local.

⚙️ Configuración del Entorno de Desarrollo

Para poner en marcha el proyecto localmente, sigue estos pasos:

Prerequisitos

Android Studio (Versión Arctic Fox o superior, con soporte para Kotlin).

JDK 17 o superior.

Conocimientos básicos de Git y Kotlin.

Instalación

Clonar el repositorio:

git clone [https://aws.amazon.com/es/what-is/repo/](https://aws.amazon.com/es/what-is/repo/)
cd FinanzasApp-TP3


Abrir en Android Studio:

Abre Android Studio y selecciona Open an existing project.

Navega a la carpeta clonada FinanzasApp-TP3.

Sincronizar Gradle:

Una vez abierto, espera a que Android Studio sincronice las dependencias de Gradle.

Configuración de la API (Mock o Real):

Asegúrate de configurar la URL base de la API en el archivo RetrofitClient.kt o donde manejes tus variables de entorno para que apunte al servicio de mock o al backend de desarrollo.

Ejecución

Selecciona un emulador o dispositivo físico compatible con la versión de Android 7.0 (API 24) o superior y haz clic en el botón Run (▶️).

🤝 Colaboración

Este proyecto está siendo desarrollado por 

El grupo 8, con los integrantes: Benjamin Castiella, Manuel Vidal, Nazzareno Ferraris, Valentina Nassif y Galo Latorre de la Vega

 para Software ORT TP3.

Para contribuir:

Haz un fork del repositorio.

Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).

Realiza tus cambios y commitea (git commit -m 'feat: Añadir nueva funcionalidad X').

Empuja tus cambios a tu fork (git push origin feature/nueva-funcionalidad).

Crea un Pull Request (PR) detallado.
Crea un Pull Request (PR) detallado.
