🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

<div align="center">

# 🎲 Soc Ops

### Social Bingo for in-person mixers

**Find people who match the prompts. Get 5 in a row. Win!**

[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat-square&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Deploy](https://img.shields.io/github/actions/workflow/status/MikeH865/my-soc-ops-java/deploy.yml?label=deploy&style=flat-square)](https://github.com/MikeH865/my-soc-ops-java/actions)

[🚀 Live Demo](https://copilot-dev-days.github.io/agent-lab-java/) · [📚 Lab Guide](workshop/GUIDE.md) · [🐛 Report Bug](https://github.com/MikeH865/my-soc-ops-java/issues)

</div>

---

## 🎮 What is Soc Ops?

Soc Ops is a **web-based Social Bingo game** designed for live events, team meetings, and in-person mixers. Each player gets a unique 5×5 bingo card filled with people-finding prompts — *"Someone who drinks tea"*, *"Someone who learned to code after 30"* — and races to get five in a row by meeting real people in the room.

> **Bonus:** Soc Ops is also a hands-on workshop for learning **GitHub Copilot Agent Mode** in VS Code. Build the game, reshape its UI, and ship new features — all guided by AI.

```
┌──────────┬──────────┬──────────┬──────────┬──────────┐
│ Speaks   │ Has a    │ Learned  │ Loves    │ Built a  │
│ 2+       │ side     │ to code  │ dark     │ mobile   │
│ languages│ project  │ after 30 │ mode     │ app      │
├──────────┼──────────┼──────────┼──────────┼──────────┤
│ Has used │ Prefers  │          │ Reads    │ Works    │
│ AI to    │ tabs     │  FREE    │ tech     │ remotely │
│ debug    │ over     │  SPACE   │ blogs    │ full-time│
│ code     │ spaces   │          │ weekly   │          │
├──────────┼──────────┼──────────┼──────────┼──────────┤
│  ...     │  ...     │  ...     │  ...     │  ...     │
└──────────┴──────────┴──────────┴──────────┴──────────┘
```

---

## ✨ Features

- 🃏 **Unique boards** — every player gets a freshly shuffled card
- ⭐ **Free space** — the center tile is always pre-marked
- 🏆 **Instant win detection** — rows, columns, and diagonals
- 💾 **Persistent state** — resume where you left off (localStorage)
- 📱 **Mobile-first** — looks great on any screen
- 🎨 **Themeable** — custom CSS utilities make restyling a breeze

---

## 🧪 Workshop Lab

This project doubles as a guided workshop for mastering **GitHub Copilot Agent Mode**. Work through the parts below to level up your agentic development skills:

| Part | Title | Time | What you'll do |
|:----:|-------|:----:|----------------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | — | Prerequisites & quick-start checklist |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | 15 min | Clone, configure, and teach the AI about your project |
| [**02**](workshop/02-design.md) | Design-First Frontend | 15 min | Redesign the UI end-to-end with creative themes |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | 10 min | Create your own bingo themes with a custom agent |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | 20 min | Ship new features with TDD and design agents in parallel |

> 📝 All guides live in [`workshop/`](workshop/) and work offline.

---

## 🚀 Quick Start

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Apache Maven 3.9+](https://maven.apache.org/) *(or use the included wrapper)*

```bash
# 1. Run the app
cd socops
./mvnw spring-boot:run
# → Open http://localhost:8080
```

```bash
# 2. Build a JAR
./mvnw clean package

# 3. Run tests
./mvnw test
```

> 💡 **Prefer containers?** Open in the included [Dev Container](.devcontainer) for a fully configured environment with Java, Maven, and all VS Code extensions pre-installed.

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java 21 |
| Framework | Spring Boot 3.4.2 |
| Build | Apache Maven (wrapper included) |
| Templates | Thymeleaf |
| Styling | Custom CSS utilities (Tailwind-inspired) |
| Deployment | GitHub Pages (auto-deploy on push to `main`) |

---

## 🤝 Contributing

Contributions are welcome! Please read [CONTRIBUTING.md](CONTRIBUTING.md) and follow the [Code of Conduct](CODE_OF_CONDUCT.md).

---

<div align="center">

Made with ☕ and GitHub Copilot

</div>
