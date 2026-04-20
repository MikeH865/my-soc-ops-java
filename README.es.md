<!-- l10n-sync: source-file="README.md" -->
<div align="center">

# 🎲 Soc Ops

### Social Bingo para encuentros presenciales

**Encuentra personas que coincidan con las preguntas. Consigue 5 en línea. ¡Gana!**

[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat-square&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Deploy](https://img.shields.io/github/actions/workflow/status/MikeH865/my-soc-ops-java/deploy.yml?label=deploy&style=flat-square)](https://github.com/MikeH865/my-soc-ops-java/actions)

[🚀 Demo en Vivo](https://copilot-dev-days.github.io/agent-lab-java/) · [📚 Guía del Lab](workshop/es/GUIDE.md) · [🐛 Reportar un Error](https://github.com/MikeH865/my-soc-ops-java/issues)

</div>

---

## 🎮 ¿Qué es Soc Ops?

Soc Ops es un **juego de Social Bingo basado en web** diseñado para eventos en vivo, reuniones de equipo y encuentros presenciales. Cada jugador obtiene una tarjeta de bingo 5×5 única, llena de preguntas para encontrar personas — *"Alguien que habla más de 2 idiomas"*, *"Alguien que aprendió a programar después de los 30"* — y compite para conseguir cinco en línea conociendo personas reales.

> **Extra:** Soc Ops también es un taller práctico para aprender el **Modo Agente de GitHub Copilot** en VS Code. Construye el juego, rediseña su interfaz y lanza nuevas funciones, todo guiado por IA.

```
┌──────────┬──────────┬──────────┬──────────┬──────────┐
│ Habla 2+ │ Tiene un │ Aprendió │ Prefiere │ Construyó│
│ idiomas  │ proyecto │ a codear │ el modo  │ una app  │
│          │ personal │ >30 años │ oscuro   │ móvil    │
├──────────┼──────────┼──────────┼──────────┼──────────┤
│ Usó IA   │ Prefiere │          │ Lee blogs│ Trabaja  │
│ para     │ tabs en  │  GRATIS  │ de tech  │ remoto   │
│ depurar  │ vez de   │          │ semanal  │ tiempo   │
│ código   │ espacios │          │          │ completo │
├──────────┼──────────┼──────────┼──────────┼──────────┤
│  ...     │  ...     │  ...     │  ...     │  ...     │
└──────────┴──────────┴──────────┴──────────┴──────────┘
```

---

## ✨ Características

- 🃏 **Tableros únicos** — cada jugador obtiene una tarjeta recién mezclada
- ⭐ **Espacio libre** — la casilla central siempre está marcada
- 🏆 **Detección de victoria instantánea** — filas, columnas y diagonales
- 💾 **Estado persistente** — retoma donde lo dejaste (localStorage)
- 📱 **Mobile-first** — se ve genial en cualquier pantalla
- 🎨 **Temático** — las utilidades CSS personalizadas hacen que cambiar el estilo sea muy fácil

---

## 🧪 Taller del Lab

Este proyecto también sirve como un taller guiado para dominar el **Modo Agente de GitHub Copilot**. Sigue las partes a continuación para mejorar tus habilidades de desarrollo agéntico:

| Parte | Título | Tiempo | Qué harás |
|:-----:|--------|:------:|-----------|
| [**00**](workshop/es/00-overview.md) | Descripción General y Lista de Verificación | — | Requisitos previos y lista de inicio rápido |
| [**01**](workshop/es/01-setup.md) | Configuración e Ingeniería de Contexto | 15 min | Clonar, configurar y enseñar al agente sobre tu proyecto |
| [**02**](workshop/es/02-design.md) | Desarrollo Frontend Orientado al Diseño | 15 min | Rediseña la interfaz de principio a fin con temas creativos |
| [**03**](workshop/es/03-quiz-master.md) | Quiz Master Personalizado | 10 min | Crea tus propios temas de bingo con un agente personalizado |
| [**04**](workshop/es/04-multi-agent.md) | Desarrollo Multi-Agente | 20 min | Lanza nuevas funciones con TDD y agentes de diseño en paralelo |

> 📝 Todas las guías están en [`workshop/es/`](workshop/es/) y funcionan sin conexión.

---

## 🚀 Inicio Rápido

**Requisitos previos:** [Java 21 JDK](https://adoptium.net/) · [Apache Maven 3.9+](https://maven.apache.org/) *(o usa el wrapper incluido)*

```bash
# 1. Ejecutar la app
cd socops
./mvnw spring-boot:run
# → Abrir http://localhost:8080
```

```bash
# 2. Compilar un JAR
./mvnw clean package

# 3. Ejecutar pruebas
./mvnw test
```

> 💡 **¿Prefieres contenedores?** Ábrelo en el [Dev Container](.devcontainer) incluido para un entorno completamente configurado con Java, Maven y todas las extensiones de VS Code preinstaladas.

---

## 🛠️ Stack Tecnológico

| Capa | Tecnología |
|------|-----------|
| Lenguaje | Java 21 |
| Framework | Spring Boot 3.4.2 |
| Build | Apache Maven (wrapper incluido) |
| Plantillas | Thymeleaf |
| Estilos | Utilidades CSS personalizadas (inspiradas en Tailwind) |
| Despliegue | GitHub Pages (auto-deploy en push a `main`) |

---

## 🤝 Contribuir

¡Las contribuciones son bienvenidas! Por favor, lee [CONTRIBUTING.md](CONTRIBUTING.md) y sigue el [Código de Conducta](CODE_OF_CONDUCT.md).

---

<div align="center">

Hecho con ☕ y GitHub Copilot

</div>
